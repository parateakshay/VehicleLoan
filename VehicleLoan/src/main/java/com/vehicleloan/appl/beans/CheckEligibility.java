package com.vehicleloan.appl.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "chk_eligibility")
public class CheckEligibility 
{
	@Id
	@Column(name = "DOC_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "HB_CHECK_SEQ")
	@SequenceGenerator(name = "HB_CHECK_SEQ",sequenceName = "docid_seq",allocationSize=1)
	private int docId;
	
	
	@OneToOne(cascade = CascadeType.MERGE) 
	@JoinColumn(name = "CUSTOMER_ID")
	private Customer customer;
	@Column(name = "CUSTOMER_EMPLOYMENT")
	private String customerEmployment;
	@Column(name = "ANNUAL_SALARY")
	private int annualSalary;
	@Column(name = "EXISITNG_EMI")
	private String existingEmi;
	@Column(name = "AADHAR")
	private String aadharCard;
	@Column(name = "PRO_PIC")
	private String proPic;
	@Column(name = "PAN_CARD")
	private String pancard;
	@Column(name = "PAYSLIP")
	private String paySlip;
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getCustomerEmployment() {
		return customerEmployment;
	}
	public void setCustomerEmployment(String customerEmployment) {
		this.customerEmployment = customerEmployment;
	}
	public int getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	public String getExistingEmi() {
		return existingEmi;
	}
	public void setExistingEmi(String existingEmi) {
		this.existingEmi = existingEmi;
	}
	public String getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}
	public String getProPic() {
		return proPic;
	}
	public void setProPic(String proPic) {
		this.proPic = proPic;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getPaySlip() {
		return paySlip;
	}
	public void setPaySlip(String paySlip) {
		this.paySlip = paySlip;
	}
	
	
	@Override
	public String toString() {
		return "CheckEligibility [docId=" + docId + ", customer=" + customer + ", customerEmployment="
				+ customerEmployment + ", annualSalary=" + annualSalary + ", existingEmi=" + existingEmi
				+ ", aadharCard=" + aadharCard + ", proPic=" + proPic + ", pancard=" + pancard + ", paySlip=" + paySlip
				+ "]";
	}
	public CheckEligibility( Customer customer, String customerEmployment, int annualSalary,
			String existingEmi, String aadharCard, String proPic, String pancard, String paySlip) {
		super();
		
		this.customer = customer;
		this.customerEmployment = customerEmployment;
		this.annualSalary = annualSalary;
		this.existingEmi = existingEmi;
		this.aadharCard = aadharCard;
		this.proPic = proPic;
		this.pancard = pancard;
		this.paySlip = paySlip;
	}
	public CheckEligibility() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
