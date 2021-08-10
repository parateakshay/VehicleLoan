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



	public String loginCustomer(String customerEmail, String customerPassword) 
	{
		
		boolean flag = loginDao.loginCustomer(customerEmail, customerPassword);
		if(flag)
		{
			return "Login successfull";
			
		}
		else
		{
			return "login failed";
			
		}
		
	}




	@Override
	public String changePassword(String customerEmail, String customerOldPassword, String customerNewPassword) 
	{
		boolean flag = loginDao.changePassword(customerEmail, customerOldPassword, customerNewPassword);
		
		if(flag)
		{
			return "password updated";
			
		}
		else
		{
			return "old password is incorrect";
			
		}
	}




	@Override
	public List<Customer> sendCustomerCredentials() 
	{
		List<Customer> customerList = loginDao.sendCustomerCredentials();
		return customerList;
		
	}
}