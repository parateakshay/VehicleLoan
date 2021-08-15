package com.vehicleloan.appl.dao;

import java.util.List;

import com.vehicleloan.appl.beans.Customer;

public interface CustomerDao 
{
	public boolean registerCustomer(Customer customer);
	public List<Customer> getAllCustomer(); 
}

