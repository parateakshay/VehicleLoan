package com.vehicleloan.appl.beans;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer 
{
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "HB_CUST_SEQ")
	@SequenceGenerator(name = "HB_CUST_SEQ",sequenceName = "customer_seq",allocationSize=1)
	@Column(name = "CUSTOMER_ID")
	@Id
	private int customerId;
	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	
	@Column(name = "CUSTOMER_EMAIL")
	private String customerEmail;
	
	@Column(name = "CUSTOMER_PASSWORD")
	private String customerPassword;
	@Column(name = "CUSTOMER_PHNUMBER")
	private long customerPhone;
	@Column(name = "CUSTOMER_DOB")
	private String DOB;
	@Column(name = "CUSTOMER_ADDRESS")
	private String address;
	
//	@OneToOne(targetEntity = Vehicle.class)
//	private Vehicle vehicle;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	
	
	public long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CustomerPojo [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerPassword=" + customerPassword + ", customerPhone=" + customerPhone
				+ ", DOB=" + DOB + ", address=" + address + "]";
	}
	public Customer(int customerId, String customerName, String customerEmail, String customerPassword,
			long customerPhone, String dOB, String address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
		this.customerPhone = customerPhone;
		DOB = dOB;
		this.address = address;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
