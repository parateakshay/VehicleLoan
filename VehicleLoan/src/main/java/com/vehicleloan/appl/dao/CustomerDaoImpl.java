package com.vehicleloan.appl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
		Query query = em.createQuery("select c from Customer c");
		List<Customer> customerList = query.getResultList();
		for(Customer c:customerList)
		{
			if(c.getCustomerEmail().equals(customer.getCustomerEmail()))
			{
				
				return false;
				
			}
			
			
		}
		
		em.persist(customer);
		return true;
	}

}
