package com.vehicleloan.appl.service;

import com.vehicleloan.appl.beans.CheckEligibility;

public interface CheckEligibilitySerivce 
{
	public String addCustomerDetails(CheckEligibility checkEligibility);
	public CheckEligibility getEligibilityDetailsByCustomerId(int customerId);
	public String addForms(String aadharcard,String photo, String pancard, String salaryslip,int customerId);
}
