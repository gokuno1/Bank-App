package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.AccountInfo;
import com.example.demo.services.AccountServiceImpl;

import io.swagger.annotations.Api;

@RestController
@Api
@RequestMapping("/accountservice")
public class AccountController {

	@Autowired
	AccountServiceImpl service;
	
	@PostMapping("/addaccount")
	public String addAccount(@RequestBody AccountInfo account)
	{
		if(service.addAccount(account))
		{
			return "Account created Successfully";
		}
		return "Error during creation";
	}
	
	@GetMapping("/getbyaccno/{accountNumber}")
	public AccountInfo getByAccNo(@PathVariable int accountNumber)
	{
		return service.getAccountByAccNumber(accountNumber);
	}
	
	@GetMapping("/getbyaccName/{accountName}")
	public AccountInfo getByAccName(@PathVariable String accountName)
	{
		return service.getAccountByAccName(accountName);
	}
	
	@DeleteMapping("/delete/{accountNumber}")
	@CacheEvict(value="account", allEntries=true)
	public void delete(@PathVariable int accountNumber)
	{
		service.deleteAccount(accountNumber);
	}
	
	@PutMapping("/update")
	public void updateDetails(@RequestBody AccountInfo account)
	{
		service.updateDetails(account);
	}
}
