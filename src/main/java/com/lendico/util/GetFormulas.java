/**
 * 
 */
package com.lendico.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Arghya
 *
 */
public class GetFormulas {

	public static BigDecimal calculateAnnunity(BigDecimal loanAmount, BigDecimal interestRate, int duration) {
		// TODO Auto-generated method stub
		BigDecimal rate = getMonthlyRate(interestRate);
		BigDecimal expo = BigDecimal.ONE.divide((rate.add(BigDecimal.ONE)).pow(duration),10, RoundingMode.HALF_UP);
		BigDecimal divisor = BigDecimal.ONE.subtract(expo);
		BigDecimal annuity = loanAmount.multiply(rate).divide(divisor,2, RoundingMode.HALF_UP);
		return annuity;
	}

	public static BigDecimal getMonthlyRate(BigDecimal annualRate) {
		 BigDecimal divisor  = new BigDecimal(1200); 
		 return annualRate.divide(divisor,10, RoundingMode.HALF_UP);
		
	}
	
	public static BigDecimal calculateInterest(BigDecimal principle, BigDecimal interestRate, int days) {
		// TODO Auto-generated method stub
		BigDecimal r = interestRate.divide(new BigDecimal(100));
		BigDecimal interest = principle.multiply(r).multiply(new BigDecimal(days)).divide(new BigDecimal("360"),2, RoundingMode.HALF_UP);
		return interest;
	}

	public static BigDecimal calculatePrinciple(BigDecimal annuity, BigDecimal interest) {
		// TODO Auto-generated method stub
		return annuity.subtract(interest).setScale(2, RoundingMode.HALF_UP);
	}

	public static BigDecimal calculateRemainingOutstandgPrincipal(BigDecimal loanAmount, BigDecimal principle) {
		return loanAmount.subtract(principle).setScale(2, RoundingMode.HALF_UP);
	}
	
	public static Date addMonthsToDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, 1);
		return calendar.getTime();

	}
	
}
