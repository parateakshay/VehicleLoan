package com.vehicleloan.appl.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.vehicleloan.appl.beans.Customer;
@Repository("loginDao")
public class LoginDaoImpl implements LoginDao
{
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public boolean loginCustomer(String customerEmail, String customerPassword) 
	{
		Customer customer = em.find(Customer.class,customerEmail);
		if(customer.getCustomerEmail().equals(customerEmail) && customer.getCustomerPassword().equals(customerPassword))
		{
			return true;
			
			
		}
		else
		{
			return false;
			
		}
		}

	
	

	@Transactional
	public boolean changePassword(String customerEmail, String customerOldPassword, String customerNewPassword) 
	{
		Customer checkCustomer = em.find(Customer.class,customerEmail);
		if(checkCustomer!=null)
		{
			if(checkCustomer.getCustomerPassword().equals(customerOldPassword))
			{
				checkCustomer.setCustomerPassword(customerNewPassword);
				em.merge(checkCustomer);
				
			}
			return true;
			
			
		}
		else
		{
			return false;
			
		}
		
		
	}	
	}


