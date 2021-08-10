package com.vehicleloan.appl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleloan.appl.beans.Customer;
import com.vehicleloan.appl.dao.CustomerDao;

@Service("Customer_Service")
public class CustomerServiceImpl implements CustomerService
{
	@Autowired()
	private CustomerDao customerDao;
	
	
	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public String registerCustomer(Customer customer) 
	{
		boolean flag = customerDao.registerCustomer(customer);
		
		
		if(flag)
		{
			return "registered successfull";
			
		}
		else
		{
			return "user is already registered before ";
			
		}
	}

}
