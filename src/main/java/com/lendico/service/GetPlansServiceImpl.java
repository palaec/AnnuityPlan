/**
 * 
 */
package com.lendico.service;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;
import com.lendico.model.LoanDetails;
import com.lendico.model.PaymentPlanModel;
import com.lendico.util.GetFormulas;

/**
 * @author Arghya
 *
 */
@Service
public class GetPlansServiceImpl implements GetPlansService{

	public List<PaymentPlanModel> generatePlan(LoanDetails loanDetails) {
		BigDecimal annuity = GetFormulas.calculateAnnunity(new BigDecimal(loanDetails.getLoanAmount()), new BigDecimal(loanDetails.getNominalRate()), loanDetails.getDuration());
		BigDecimal interest = GetFormulas.calculateInterest(new BigDecimal(loanDetails.getLoanAmount()), new BigDecimal(loanDetails.getNominalRate()), 30);
		BigDecimal principle = GetFormulas.calculatePrinciple(annuity, interest);		
		List<PaymentPlanModel> list = new ArrayList<PaymentPlanModel>();		
		list = calculatePaymentPlanModelList(list ,loanDetails.getDuration(),new BigDecimal(loanDetails.getNominalRate()),loanDetails.getStartDate(),annuity,principle,interest,new BigDecimal(loanDetails.getLoanAmount()));
		return list;
	}

	private List<PaymentPlanModel> calculatePaymentPlanModelList(List<PaymentPlanModel> list , int duration,BigDecimal nominalRate,  Date startDate, BigDecimal annuity, BigDecimal principal, BigDecimal interest, BigDecimal initialOutstandingPrincipal) {
		PaymentPlanModel model = new PaymentPlanModel();
		model.setBorrowerPaymentAmount(annuity.toString());
		DateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		model.setDate(simple.format(startDate));
		model.setPrincipal(principal.toString());
		model.setInterest(interest.toString());
		model.setInitialOutstandingPrincipal(initialOutstandingPrincipal.toString());
		BigDecimal remainingOutstandingPrincipal = GetFormulas.calculateRemainingOutstandgPrincipal(initialOutstandingPrincipal,principal);
		model.setRemainingOutstandingPrincipal(remainingOutstandingPrincipal.toString());
		list.add(model);
		if(duration > 1) {
			Date date = new Date();
			date = GetFormulas.addMonthsToDate(startDate);
			initialOutstandingPrincipal = remainingOutstandingPrincipal;
			duration = duration - 1 ;
			annuity = GetFormulas.calculateAnnunity(initialOutstandingPrincipal, nominalRate, duration);
		    interest = GetFormulas.calculateInterest(initialOutstandingPrincipal, nominalRate, 30);
		    principal = GetFormulas.calculatePrinciple(annuity, interest);
		    if(principal.compareTo(initialOutstandingPrincipal) > 0) {
		    	principal = initialOutstandingPrincipal;
		    }
		    remainingOutstandingPrincipal = GetFormulas.calculateRemainingOutstandgPrincipal(initialOutstandingPrincipal,principal);
			calculatePaymentPlanModelList(list, duration,nominalRate ,date,annuity,principal,interest,initialOutstandingPrincipal);	 // A recursive call
		}
		return list;
	}
	
}
