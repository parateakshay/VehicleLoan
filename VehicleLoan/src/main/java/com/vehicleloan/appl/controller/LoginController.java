package com.vehicleloan.appl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleloan.appl.beans.Admin;
import com.vehicleloan.appl.beans.Customer;
import com.vehicleloan.appl.service.AdminService;
import com.vehicleloan.appl.service.LoginService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/vehicleloan")
public class LoginController 
{
	@Autowired
	private LoginService loginService;
	private AdminService adminService;
		
	@GetMapping(path="/loginCustomerByEmail/{email}",produces="application/json")
	public Customer getCustomerByEmail(@PathVariable(value="email") String customerEmail)
	{
		return loginService.getCustomerByEmail(customerEmail);
	}
	
	@GetMapping(path="/loginAdminByEmail/{email}",produces="application/json")
	public Admin getAdminByEmail(@PathVariable(value="email") String adminEmail)
	{
		System.out.println("inside controller");
		return adminService.adminLogin(adminEmail);
	}
	
	
}
