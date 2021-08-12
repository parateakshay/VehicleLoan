package com.vehicleloan.appl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleloan.appl.beans.CheckEligibility;
import com.vehicleloan.appl.dao.CheckEligibilityDao;

@Service("checkEligibilityService")
public class CheckEligibilitySerivceImpl implements CheckEligibilitySerivce
{
	@Autowired()
	private CheckEligibilityDao checkEligibilityDao;
	
	
	
	public CheckEligibilityDao getCheckEligibilityDao() {
		return checkEligibilityDao;
	}





	public String addCustomerDetails(CheckEligibility checkEligibility) 
	{
		checkEligibilityDao.addCustomerDetails(checkEligibility);
		
		return "done";
	}

}
