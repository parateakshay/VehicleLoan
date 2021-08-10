package com.vehicleloan.appl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleloan.appl.beans.Customer;
import com.vehicleloan.appl.dao.LoginDao;
import com.vehicleloan.appl.dao.LoginDaoImpl;

@Service("Login_Service")
public class LoginServiceImpl implements LoginService
{
	@Autowired()
	private LoginDao loginDao;
	
	
	
	public LoginDao getLoginDao() {
		return loginDao;
	}

	


	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

//	@Override
//	public String changePassword(String customerEmail, String customerOldPassword, String customerNewPassword) 
//	{
//		boolean flag = loginDao.changePassword(customerEmail, customerOldPassword, customerNewPassword);
//		
//		if(flag)
//		{
//			return "password updated";
//			
//		}
//		else
//		{
//			return "old password is incorrect";
//			
//		}
//	}

	@Override
	public Customer getCustomerByEmail(String customerEmail) 
	{
		System.out.println(customerEmail);
		Customer customer = loginDao.getCustomerByEmail(customerEmail);	
		System.out.println(customer);
		return customer;
	}
}