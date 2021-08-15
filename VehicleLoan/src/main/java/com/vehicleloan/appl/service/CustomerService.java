package com.vehicleloan.appl.service;

import java.util.List;

import com.vehicleloan.appl.beans.Customer;

public interface CustomerService 
{
	public String registerCustomer(Customer customer);
	public List<Customer> getAllCustomer(); 

}

