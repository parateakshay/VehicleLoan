package com.vehicleloan.appl.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BANK")
public class Bank 
{
	@Id
	@Column(name ="BANK_ID")
	private int bankId;
	@Column(name ="BANK_NAME")
	private String bankName;
	@Column(name ="VEHICLE_INTEREST")
	private int vehicleLoanInterest;
	@Column(name ="PRO_FEE")
	private int proccessingFee;
	
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
	public void setVehicleLoanInterest(int vehicleLoanInterest) {
		this.vehicleLoanInterest = vehicleLoanInterest;
	}
	public int getProccessingFee() {
		return proccessingFee;
	}
	public void setProccessingFee(int proccessingFee) {
		this.proccessingFee = proccessingFee;
	}
	
	
	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", vehicleLoanInterest=" + vehicleLoanInterest
				+ ", proccessingFee=" + proccessingFee + "]";
	}
	public Bank(int bankId, String bankName, int vehicleLoanInterest, int proccessingFee, int loanTenure) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.vehicleLoanInterest = vehicleLoanInterest;
		this.proccessingFee = proccessingFee;
		
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
