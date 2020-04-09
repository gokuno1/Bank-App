package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AccountProxy;
import com.example.demo.models.AccountInfo;
import com.example.demo.models.TransactionModel;
import com.example.demo.services.TransactionServiceImpl;

@RestController
@RequestMapping("/transactionservice")
public class TransactionController {

	@Autowired
	TransactionServiceImpl service;
	
	@Autowired
	AccountProxy proxy;
	
	@GetMapping("/transferamount/{accountNoFrom}/{accountNoTo}/{amount}/{method}")
	public void transferAmount(@PathVariable int accountNoFrom, @PathVariable  int accountNoTo, @PathVariable  double amount, @PathVariable String method)
	{
		AccountInfo response1 = proxy.getByAccNo(accountNoFrom);
		AccountInfo response2 = proxy.getByAccNo(accountNoTo);
		TransactionModel model = new TransactionModel(accountNoFrom, accountNoTo,method, amount);
		service.transferFunds(model);
		response1.setBalance(response1.getBalance() - amount);
		response2.setBalance(response2.getBalance() + amount);
		proxy.updateDetails(response1);
		proxy.updateDetails(response2);
	}
	
}