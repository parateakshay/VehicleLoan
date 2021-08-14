package com.vehicleloan.appl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleloan.appl.beans.Customer;
import com.vehicleloan.appl.beans.Loan;
import com.vehicleloan.appl.beans.Vehicle;
import com.vehicleloan.appl.service.LoanService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/vehicleloan/applyLoan")
public class LoanController 
{
	@Autowired
	private LoanService loanService;
	
	@PostMapping(path="/apply")
	public void registerLoan(@RequestBody Loan loan)
	{
		System.out.println("Entered the controller");
		String msg = loanService.addLoan(loan);
		System.out.println(msg);
	}
	
	@GetMapping(path = "/get-loanDetails/{customerId}",produces="application/json")
	public Loan getLoanDetails(@PathVariable(value="customerId") int customerId)
	{
		System.out.println(loanService.getLoanByCustomerId(customerId));
		return loanService.getLoanByCustomerId(customerId);
	}

}
