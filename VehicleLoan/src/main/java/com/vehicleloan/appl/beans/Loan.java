package com.vehicleloan.appl.beans;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Loan 
{
	private int loanId;
	private String loanStatus;
	private String loanApplicationDate;
	private int loanTenure;
	private String loanRemark;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "CUSTOMER_ID")
	private Customer customer;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public String getLoanApplicationDate() {
		return loanApplicationDate;
	}
	public void setLoanApplicationDate(String loanApplicationDate) {
		this.loanApplicationDate = loanApplicationDate;
	}
	public int getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}
	public String getLoanRemark() {
		return loanRemark;
	}
	public void setLoanRemark(String loanRemark) {
		this.loanRemark = loanRemark;
	}
	
	
	
}
