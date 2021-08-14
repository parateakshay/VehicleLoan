package com.vehicleloan.appl.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "loan_applied")
public class Loan 
{
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "HB_LOAN_SEQ")
	@SequenceGenerator(name = "HB_LOAN_SEQ",sequenceName = "loanid_seq",allocationSize=1)
	@Column(name = "loan_id")
	@Id
	private int loanId;
	@Column(name = "loan_status")
	private String loanStatus;
	@Column(name = "loan_application_date")
	private String loanApplicationDate;
	@Column(name = "loan_tenure")
	private int loanTenure;
	@Column(name = "loan_amt")
	private int loanAmount;
	
	
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Loan(int loanId, String loanStatus, String loanApplicationDate, int loanTenure, int loanAmount,
			Customer customer, Bank bank, Vehicle vehicle) {
		super();
		this.loanId = loanId;
		this.loanStatus = loanStatus;
		this.loanApplicationDate = loanApplicationDate;
		this.loanTenure = loanTenure;
		this.loanAmount = loanAmount;
		this.customer = customer;
		this.bank = bank;
		this.vehicle = vehicle;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}


	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "CUSTOMER_ID")
	private Customer customer;
	
	@ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER) //multiple loans but only one bank
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
				+ ", loanTenure=" + loanTenure + ", loanAmount=" + loanAmount + ", customer=" + customer + ", bank="
				+ bank + ", vehicle=" + vehicle + "]";
	}
	
}
