package com.vehicleloan.appl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleloan.appl.beans.Bank;
import com.vehicleloan.appl.dao.BankDao;
@Service("bankService")
public class BankServiceImpl implements BankService
{
	@Autowired
	private BankDao bankDao;
	
	
	public BankDao getBankDao() {
		return bankDao;
	}


	public void setBankDao(BankDao bankDao) {
		this.bankDao = bankDao;
	}


	public Bank getBankDetails() 
	{
		System.out.println("entering bank in service layer");
		Bank bank = bankDao.getBankDetails();
		return bank;
	}
	

}
