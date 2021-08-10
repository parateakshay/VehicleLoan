package com.vehicleloan.appl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleloan.appl.beans.Customer;
import com.vehicleloan.appl.service.CustomerService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/vehicleloan")
public class CustomerController 
{
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(path="/registerCustomer")
	public void registerCustomer(@RequestBody Customer customer)
	{
		String msg = customerService.registerCustomer(customer);
		System.out.println(msg);
	}
	

}
