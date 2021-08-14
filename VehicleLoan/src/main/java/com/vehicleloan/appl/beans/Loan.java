package com.vehicleloan.appl.beans;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Loan 
{
	private int loanId;
	private String loanStatus;
	private String loanApplicationDate;
	private int loanTenure;
	
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "CUSTOMER_ID")
	private Customer customer;
	
	@ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.LAZY) //multiple loans but only one bank
	@JoinColumn(name = "BANK_ID")
	private Bank bank;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "VEHICLE_ID")
	private Vehicle vehicle;
	
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
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

	
	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", loanStatus=" + loanStatus + ", loanApplicationDate=" + loanApplicationDate
				+ ", loanTenure=" + loanTenure + ", customer=" + customer + ", bank=" + bank + ", vehicle=" + vehicle
				+ "]";
	}
	
}
