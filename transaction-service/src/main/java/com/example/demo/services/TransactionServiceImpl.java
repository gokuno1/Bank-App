package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.TransactionModel;
import com.example.demo.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionRepository repository;
	
	@Override
	public void transferFunds(TransactionModel model) {
		// TODO Auto-generated method stub
		repository.save(model);
	}

}
