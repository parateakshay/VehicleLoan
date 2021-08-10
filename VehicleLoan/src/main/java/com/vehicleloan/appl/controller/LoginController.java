package com.vehicleloan.appl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleloan.appl.beans.Customer;
import com.vehicleloan.appl.service.LoginService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/vehicleloan")
public class LoginController 
{
	@Autowired
	private LoginService loginService;

	@PostMapping("/loginCustomer")
	public List<Customer> getCustomerList()
	{
		return loginService.sendCustomerCredentials();
	}
	
	
}
