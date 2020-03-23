/**
 * 
 */
package com.lendico.service;

import java.util.List;

import com.lendico.model.LoanDetails;
import com.lendico.model.PaymentPlanModel;

/**
 * @author Arghya
 *
 */
public interface GetPlansService {

	List<PaymentPlanModel> generatePlan(LoanDetails loanDetails);

}
