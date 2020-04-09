package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import com.example.demo.models.AccountInfo;
import com.example.demo.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository repository;
	
	/**
	 *
	 */
	@Override
	public boolean addAccount(AccountInfo account) {
		// TODO Auto-generated method stub
		AccountInfo accountinfo = repository.save(account);
		if(accountinfo!=null)
		{
			return true;
		}
		return false;
	}

	/**
	 *
	 */
	@Override
	@CacheEvict(value = "account", key = "#accountNumber")
	public boolean deleteAccount(int accountNumber) {
		// TODO Auto-generated method stub
		repository.deleteById(accountNumber);
		return true;
	}

	@Override
	public AccountInfo getAccountByAccNumber(int accountNumber) {
		// TODO Auto-generated method stub
		Optional<AccountInfo> account = repository.findById(accountNumber);
		return account.get();
	}

	@Override
	public AccountInfo getAccountByAccName(String accountName) {
		// TODO Auto-generated method stub
		AccountInfo account = repository.findByaccountName(accountName);
		return account;
	}

	@Override
	@CachePut(value = "account", key = "#accountinfo.accountNumber")
	public AccountInfo updateDetails(AccountInfo accountinfo) {
		// TODO Auto-generated method stub
		Optional<AccountInfo> account = repository.findById(accountinfo.getAccountNumber());
		if(account.isPresent())
		{
			repository.save(accountinfo);
		}
		return accountinfo;
	}

}













