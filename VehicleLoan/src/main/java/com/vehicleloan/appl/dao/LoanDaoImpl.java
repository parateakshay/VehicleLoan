package com.vehicleloan.appl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.vehicleloan.appl.beans.Loan;
import com.vehicleloan.appl.service.LoanService;
@Repository("loanDao")
public class LoanDaoImpl implements LoanDao
{
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public boolean addLoan(Loan loan) 
	{
		System.out.println("enter dao layer");
		em.persist(loan);
		return true;
	}

	@Transactional
	public Loan getLoanByCustomerId(int customerId) 
	{
		TypedQuery<Loan> query = em.createQuery("select l from Loan l INNER JOIN l.customer a where a.customerId = "+customerId,Loan.class);
		Loan loan = query.getSingleResult();
		System.out.println(loan);
		return loan;
	}

}
