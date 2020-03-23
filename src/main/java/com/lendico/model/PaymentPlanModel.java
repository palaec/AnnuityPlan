/**
 * 
 */
package com.lendico.model;

/**
 * @author Arghya
 *
 */
public class PaymentPlanModel {
	
	String borrowerPaymentAmount;
	String date;
	String initialOutstandingPrincipal;
	String interest;
	String principal;
	String remainingOutstandingPrincipal;
	
	public String toString() {
		return borrowerPaymentAmount + "----" + date + "----" + initialOutstandingPrincipal + "----" + interest + "----" + principal + "----" + remainingOutstandingPrincipal;
	}
	
	public PaymentPlanModel() {}
	
	public PaymentPlanModel(String borrowerPaymentAmount, String date, String initialOutstandingPrincipal,
			String interest, String principal, String remainingOutstandingPrincipal) {
		super();
		this.borrowerPaymentAmount = borrowerPaymentAmount;
		this.date = date;
		this.initialOutstandingPrincipal = initialOutstandingPrincipal;
		this.interest = interest;
		this.principal = principal;
		this.remainingOutstandingPrincipal = remainingOutstandingPrincipal;
	}
	/**
	 * @return the borrowerPaymentAmount
	 */
	public String getBorrowerPaymentAmount() {
		return borrowerPaymentAmount;
	}
	/**
	 * @param borrowerPaymentAmount the borrowerPaymentAmount to set
	 */
	public void setBorrowerPaymentAmount(String borrowerPaymentAmount) {
		this.borrowerPaymentAmount = borrowerPaymentAmount;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		
		this.date = date;
	}
	/**
	 * @return the initialOutstandingPrincipal
	 */
	public String getInitialOutstandingPrincipal() {
		return initialOutstandingPrincipal;
	}
	/**
	 * @param initialOutstandingPrincipal the initialOutstandingPrincipal to set
	 */
	public void setInitialOutstandingPrincipal(String initialOutstandingPrincipal) {
		this.initialOutstandingPrincipal = initialOutstandingPrincipal;
	}
	/**
	 * @return the interest
	 */
	public String getInterest() {
		return interest;
	}
	/**
	 * @param interest the interest to set
	 */
	public void setInterest(String interest) {
		this.interest = interest;
	}
	/**
	 * @return the principal
	 */
	public String getPrincipal() {
		return principal;
	}
	/**
	 * @param principal the principal to set
	 */
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	/**
	 * @return the remainingOutstandingPrincipal
	 */
	public String getRemainingOutstandingPrincipal() {
		return remainingOutstandingPrincipal;
	}
	/**
	 * @param remainingOutstandingPrincipal the remainingOutstandingPrincipal to set
	 */
	public void setRemainingOutstandingPrincipal(String remainingOutstandingPrincipal) {
		this.remainingOutstandingPrincipal = remainingOutstandingPrincipal;
	}
	
	
	
	
}
