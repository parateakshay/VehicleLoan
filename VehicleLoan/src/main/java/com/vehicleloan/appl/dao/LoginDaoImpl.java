package com.vehicleloan.appl.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.vehicleloan.appl.beans.Customer;
@Repository("loginDao")
public class LoginDaoImpl implements LoginDao
{
	@PersistenceContext
	private EntityManager em;

	
//	@Transactional
//	public boolean changePassword(String customerEmail, String customerOldPassword, String customerNewPassword) 
//	{
//		Customer checkCustomer = em.find(Customer.class,customerEmail);
//		if(checkCustomer!=null)
//		{
//			if(checkCustomer.getCustomerPassword().equals(customerOldPassword))
//			{
//				checkCustomer.setCustomerPassword(customerNewPassword);
//				em.merge(checkCustomer);
//				
//			}
//			return true;
//			
//			
//		}
//		else
//		{
//			return false;
//		}
//	}


	@Override
	public Customer getCustomerByEmail(String customerEmail) 
	{
		Query query = em.createQuery("select c from Customer c");
		List<Customer> customerList = query.getResultList();
		for(Customer c:customerList)
		{
			if(c.getCustomerEmail().equals(customerEmail))
			{
				
				return c;
				
			}
			
			
		}
		
		return null;
	}	
	}


