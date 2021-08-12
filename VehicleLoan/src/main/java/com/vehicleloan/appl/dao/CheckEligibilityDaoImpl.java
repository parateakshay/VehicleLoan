package com.vehicleloan.appl.dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.vehicleloan.appl.beans.CheckEligibility;
import com.vehicleloan.appl.beans.Customer;

@Repository("checkEligibilityDao")
public class CheckEligibilityDaoImpl implements CheckEligibilityDao
{
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public boolean addCustomerDetails(CheckEligibility checkEligibility) 
	{
//		Customer cust = em.find(Customer.class,tempCustomerId);
		
//		if(cust!=null)
//		{
//			checkEligibility.setCustomer(cust);
//			em.persist(checkEligibility);
//			return true;
//		}
		em.persist(checkEligibility);
		
		return true;
	}

	

}
