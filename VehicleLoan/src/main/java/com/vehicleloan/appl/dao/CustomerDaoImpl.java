package com.vehicleloan.appl.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.vehicleloan.appl.beans.Customer;
@Repository("customerDao")

public class CustomerDaoImpl implements CustomerDao
{
	@PersistenceContext
	private EntityManager em;


	
	@Transactional
	public boolean registerCustomer(Customer customer) 
	{
		Customer checkCustomer = em.find(Customer.class,customer.getCustomerEmail());
		
		if(checkCustomer==null)
		{
			em.persist(customer);
			return true;
		}
		else
		{
			return false;
			
		}
	}

}
