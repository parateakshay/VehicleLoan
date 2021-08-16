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
import com.vehicleloan.appl.beans.Forms;
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
	
//	@GetMapping(path = "/add-forms/{customerId}/{aadharcard}/{photo}/{pancard}/{salarySlip}")
//	public String addForms(@PathVariable(value="customerId") int customerId,@PathVariable(value="aadharcard") String aadharcard,
//			@PathVariable(value="photo") String photo,@PathVariable(value="salarySlip") String salarySlip,@PathVariable(value="pancard") String pancard)
//	{
////		System.out.println(checkDetails);
//		checkEligibilityService.addForms(aadharcard, photo, pancard, salarySlip, customerId);
//		return "added";
//	}
	
	@PostMapping(path="/add-chkforms")
	public String addForms(@RequestBody Forms form)
	{
		
		checkEligibilityService.addForms(form.getAadhar(), form.getPhoto(), form.getPancard(), form.getPayslip(), form.getCustomerId());
		
		return "ok";
	}
	
	
	
}
