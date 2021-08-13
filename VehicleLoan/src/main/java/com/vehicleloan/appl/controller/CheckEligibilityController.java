package com.vehicleloan.appl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleloan.appl.beans.CheckEligibility;
import com.vehicleloan.appl.beans.Customer;
import com.vehicleloan.appl.service.CheckEligibilitySerivce;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/vehicleloan/checkEligibility")
public class CheckEligibilityController 
{
	@Autowired
	private CheckEligibilitySerivce checkEligibilityService;
	
	@PostMapping(path="/check-Eligiblity")
	public int addCustomerDetails(@RequestBody CheckEligibility checkDetails)
	{
		
	String msg = checkEligibilityService.addCustomerDetails(checkDetails);
		System.out.println(msg);
		return checkDetails.getDocId();
	}
	
	@GetMapping(path = "/get-Eligibility/{customerId}",produces="application/json")
	public CheckEligibility getEligibility(@PathVariable(value="customerId") int customerId)
	{
		
		return checkEligibilityService.getEligibilityDetailsByCustomerId(customerId);
	}
	
	

}
