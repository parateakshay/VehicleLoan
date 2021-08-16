package com.vehicleloan.appl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleloan.appl.beans.Admin;
import com.vehicleloan.appl.dao.LoginDao;

@Service("Admin_Service")
public class AdminServiceImpl implements AdminService
{
	@Autowired()
	private LoginDao loginDao;
	
	
	
	public LoginDao getLoginDao() {
		return loginDao;
	}



	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}


	public Admin adminLogin(String adminEmail) {
		System.out.println("inside service");
		return loginDao.getAdminByEmail(adminEmail);
	}

}
