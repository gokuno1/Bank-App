package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.models.AccountInfo;

@Service
public interface AccountService {

	/**
	 * @param account
	 * @return boolean
	 */
	public boolean addAccount(AccountInfo account);
	
	/**
	 * @param accountNumber
	 * @return boolean
	 */
	public boolean deleteAccount(int accountNumber);
	
	/**
	 * @param accountNumber
	 * @return AccountInfo
	 */
	public AccountInfo getAccountByAccNumber(int accountNumber);
	
	/**
	 * @param accountName
	 * @return AccountInfo
	 */
	public AccountInfo getAccountByAccName(String accountName);
	
	
	/**
	 * @param accountNumber
	 * @param account
	 * @return AccountInfo
	 */
	public AccountInfo updateDetails(int accountNumber, AccountInfo account);
}
