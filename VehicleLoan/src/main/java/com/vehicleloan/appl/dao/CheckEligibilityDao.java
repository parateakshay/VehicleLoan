package com.vehicleloan.appl.dao;

import com.vehicleloan.appl.beans.CheckEligibility;

public interface CheckEligibilityDao 
{
	public boolean addCustomerDetails(CheckEligibility checkEligibility);
	public CheckEligibility getEligibilityDetailsByCustomerId(int customerId);
	public void addForms(String aadharcard,String photo, String pancard, String salaryslip,int customerId);

}
