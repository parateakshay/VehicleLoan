package com.vehicleloan.appl.dao;

import java.util.List;

import com.vehicleloan.appl.beans.Customer;

public interface LoginDao 
{
//	public boolean changePassword(String customerEmail,String customerOldPassword,String customerNewPassword);
	public Customer getCustomerByEmail(String customerEmail);

}

