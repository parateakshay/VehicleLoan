package com.vehicleloan.appl.dao;

import com.vehicleloan.appl.beans.Customer;

public interface LoginDao 
{
	public boolean loginCustomer(String customerEmail,String customerPassword);
	public boolean changePassword(String customerEmail,String customerOldPassword,String customerNewPassword);

}

