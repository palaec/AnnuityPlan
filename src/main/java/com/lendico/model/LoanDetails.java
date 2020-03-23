/**
 * 
 */
package com.lendico.model;

import java.math.BigInteger;
import java.util.Date;

/**
 * @author Arghya
 *
 */
public class LoanDetails {

	String loanAmount;
	String nominalRate;
	int duration;
	Date startDate;
	
	public String toString() {
		return loanAmount + "----" + nominalRate + "----" + duration + "----" + startDate ;
	}
	/**
	 * @return the loanAmount
	 */
	public String getLoanAmount() {
		return loanAmount;
	}
	/**
	 * @param loanAmount the loanAmount to set
	 */
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}


	/**
	 * @return the nominalRate
	 */
	public String getNominalRate() {
		return nominalRate;
	}
	/**
	 * @param nominalRate the nominalRate to set
	 */
	public void setNominalRate(String nominalRate) {
		this.nominalRate = nominalRate;
	}
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	
}
