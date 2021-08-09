package com.vehicleloan.appl.service;


public interface LoginService 
{
	public String loginCustomer(String customerEmail,String customerPassword);
	public String changePassword(String customerEmail,String customerOldPassword,String customerNewPassword);
}

