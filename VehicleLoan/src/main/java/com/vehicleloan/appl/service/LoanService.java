package com.vehicleloan.appl.service;

import java.util.List;

import com.vehicleloan.appl.beans.Loan;

public interface LoanService 
{
	public String addLoan(Loan loan);
	public Loan getLoanByCustomerId(int customerId);
	public List<Loan> getPendingLoans();
	public List<Loan> getRejectedLoans();
	public String rejectLoan(Loan loan);
	public String acceptLoan(Loan loan);
}
