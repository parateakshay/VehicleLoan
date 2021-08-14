package com.vehicleloan.appl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.vehicleloan.appl.beans.Bank;
@Repository("bankDao")
public class BankDaoImpl implements BankDao
{

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public Bank getBankDetails() 
	{
		System.out.println("entering bank in dao layer");
		TypedQuery<Bank> query = em.createQuery("select b from Bank b",Bank.class);
		List<Bank> b = query.getResultList();
		System.out.println(b);
		Bank bank = b.get(0);
		return bank;
		
	}

}
