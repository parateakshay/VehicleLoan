package com.vehicleloan.appl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleloan.appl.beans.Loan;
import com.vehicleloan.appl.dao.LoanDao;
@Service("loanService")
public class LoanServiceImpl implements LoanService
{
	
	@Autowired
	private LoanDao loanDao;
	
	
	public LoanDao getLoanDao() {
		return loanDao;
	}



	public void setLoanDao(LoanDao loanDao) {
		this.loanDao = loanDao;
	}



	public String addLoan(Loan loan) {
		System.out.println("enter service layer");
		boolean flag = loanDao.addLoan(loan);
		if(flag)
		{
			return "loan added successfully";
			
		}
		else
		{
			return "try again";
			
		}
		
	}



	public Loan getLoanByCustomerId(int customerId) 
	{
		
		return loanDao.getLoanByCustomerId(customerId);
	}



	@Override
	public List<Loan> getPendingLoans() {
	
		return loanDao.getPendingLoans();
	}



	@Override
	public List<Loan> getRejectedLoans() {
		
		return loanDao.getRejectedLoans();
	}



	@Override
	public String rejectLoan(Loan loan) {
		loanDao.rejectLoan(loan);
		return "rejected";
	}



	@Override
	public String acceptLoan(Loan loan) {
		loanDao.acceptLoan(loan);
		return "accepted";
	}
	

}
