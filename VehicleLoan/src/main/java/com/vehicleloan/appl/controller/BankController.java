package com.vehicleloan.appl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleloan.appl.beans.Bank;
import com.vehicleloan.appl.service.BankService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/vehicleloan/bank")
public class BankController 
{
	
	@Autowired
	private BankService bankService;
	
	@GetMapping(path="/getBankDetails/",produces="application/json")
	public Bank getCustomerByEmail()
	{
		System.out.println("Entering bank");
		return bankService.getBankDetails();
	}
	

}
