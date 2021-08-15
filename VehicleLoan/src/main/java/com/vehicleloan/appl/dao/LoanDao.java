package com.vehicleloan.appl.dao;

import java.util.List;

import com.vehicleloan.appl.beans.Loan;

public interface LoanDao 
{
	public boolean addLoan(Loan loan);
	public Loan getLoanByCustomerId(int customerId);
	public List<Loan> getPendingLoans();
	public List<Loan> getRejectedLoans();
	public void rejectLoan(Loan loan);
	public void acceptLoan(Loan loan);
}
