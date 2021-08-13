package com.vehicleloan.appl.beans;

public class Bank 
{
	private int bankId;
	private String bankName;
	private double vehicleLoanInterest;
	private int proccessingFee;
	private int loanTenure;
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public double getVehicleLoanInterest() {
		return vehicleLoanInterest;
	}
	public void setVehicleLoanInterest(double vehicleLoanInterest) {
		this.vehicleLoanInterest = vehicleLoanInterest;
	}
	public int getProccessingFee() {
		return proccessingFee;
	}
	public void setProccessingFee(int proccessingFee) {
		this.proccessingFee = proccessingFee;
	}
	public int getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}
	public Bank(int bankId, String bankName, double vehicleLoanInterest, int proccessingFee, int loanTenure) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.vehicleLoanInterest = vehicleLoanInterest;
		this.proccessingFee = proccessingFee;
		this.loanTenure = loanTenure;
	}
	
}
