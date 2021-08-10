package com.vehicleloan.appl.dao;

import java.util.List;

import com.vehicleloan.appl.beans.Customer;

public interface LoginDao 
{
	public boolean loginCustomer(String customerEmail,String customerPassword);
	public boolean changePassword(String customerEmail,String customerOldPassword,String customerNewPassword);
	public List<Customer> sendCustomerCredentials();
	public Customer getCustomerByEmail(String customerEmail);

}

