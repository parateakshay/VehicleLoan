package com.vehicleloan.appl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleloan.appl.beans.CheckEligibility;
import com.vehicleloan.appl.service.CheckEligibilitySerivce;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/vehicleloan/checkEligibility")
public class CheckEligibilityController 
{
	@Autowired
	private CheckEligibilitySerivce checkEligibilityService;
	
	@PostMapping(path="/check-Eligiblity")
	public void addCustomerDetails(@RequestBody CheckEligibility checkDetails)
	{
		
	String msg = checkEligibilityService.addCustomerDetails(checkDetails);
		System.out.println(msg);
	}

}
