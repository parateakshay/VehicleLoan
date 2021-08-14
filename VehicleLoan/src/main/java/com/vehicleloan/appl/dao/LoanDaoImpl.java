package com.vehicleloan.appl.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.vehicleloan.appl.beans.Loan;
@Repository("loanDao")
public class LoanDaoImpl implements LoanDao
{
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public boolean addLoan(Loan loan) 
	{
		
//		em.persist(loan);
		return true;
	}

}
