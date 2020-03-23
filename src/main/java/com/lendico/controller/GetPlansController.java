/**
 * 
 */
package com.lendico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lendico.model.LoanDetails;
import com.lendico.model.PaymentPlanModel;
import com.lendico.service.GetPlansService;

/**
 * @author Arghya
 *
 */
@RestController
public class GetPlansController {
	
	@Autowired
	GetPlansService getPlansService;
	
	@PostMapping(path = "/generate-plan", consumes = "application/json")
	public List<PaymentPlanModel> generatePlan(@RequestBody LoanDetails loanDetails) {
		List<PaymentPlanModel> list = getPlansService.generatePlan(loanDetails);
		return list;
	}
	

}
