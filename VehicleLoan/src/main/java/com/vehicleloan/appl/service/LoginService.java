package com.vehicleloan.appl.service;



import com.vehicleloan.appl.beans.Customer;

public interface LoginService 
{
	
//	public String changePassword(String customerEmail,String customerOldPassword,String customerNewPassword);
	public Customer getCustomerByEmail(String customerEmail);
	
}

