package com.vehicleloan.appl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
	@Transactional
	public List<Loan> getPendingLoans() 
	{
		String sql = "SELECT l FROM Loan l WHERE l.loanStatus='Waiting'";

		Query qry = em.createQuery(sql);

		List<Loan> loanList = qry.getResultList();
		return loanList;
		
		
	}
	@Transactional
	public List<Loan> getRejectedLoans() {
		String sql = "SELECT l FROM Loan l WHERE l.loanStatus='REJECTED'";

		Query qry = em.createQuery(sql);

		List<Loan> loanList = qry.getResultList();
		return loanList;
	}
	@Transactional
	public void rejectLoan(Loan loan) 
	{
		Loan l = em.find(Loan.class, loan.getLoanId());
		l.setLoanStatus("REJECTED");
		em.merge(l);
		
	}
	@Transactional
	public void acceptLoan(Loan loan) 
	{
		Loan l = em.find(Loan.class, loan.getLoanId());
		l.setLoanStatus("ACCEPTED");
		em.merge(l);
		
	}

}
