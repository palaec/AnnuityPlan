package com.lendico.annuityplan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import com.lendico.model.LoanDetails;
import com.lendico.model.PaymentPlanModel;
import com.lendico.service.GetPlansServiceImpl;

@SpringBootTest
class AnnuityplanApplicationTests {

	@InjectMocks
	GetPlansServiceImpl getPlansService;
	
	@Test
	void generatePlan_test() {
		
		LoanDetails loanDetails = new LoanDetails();
		loanDetails.setLoanAmount("5000");
		loanDetails.setNominalRate("5.00");
		loanDetails.setDuration(24);
		try {
			Date d= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2018-01-01 00:00:01");
			loanDetails.setStartDate(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PaymentPlanModel paymentPlanModel1 = new PaymentPlanModel("219.36" , "2018-01-01 00:00:01" , "5000" , "20.83" , "198.53" ,  "4801.47"); 
		List <PaymentPlanModel> paymentPlanModelList= getPlansService.generatePlan(loanDetails);
		assertEquals(paymentPlanModel1.getBorrowerPaymentAmount(),paymentPlanModelList.get(0).getBorrowerPaymentAmount());
	}

}
