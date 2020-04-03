package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "transactionInfo")
public class TransactionModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int transactionId;
	
	@Column(name = "accountNumberFrom")
	private int accountNoFrom;
	
	@Column(name = "accountNumberTo")
	private int accountNoTo;
	
	@Column(name = "paymentMethod")
	private String paymentMethod;
	
	@Column(name = "transactionAmount")
	private double amount;
	
	public TransactionModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public TransactionModel(int accountNoFrom, int accountNoTo, String paymentMethod, double amount) {
		super();
		this.accountNoFrom = accountNoFrom;
		this.accountNoTo = accountNoTo;
		this.paymentMethod = paymentMethod;
		this.amount = amount;
	}


	public TransactionModel(@NotNull int transactionId, int accountNoFrom, int accountNoTo, String paymentMethod,
			double amount) {
		super();
		this.transactionId = transactionId;
		this.accountNoFrom = accountNoFrom;
		this.accountNoTo = accountNoTo;
		this.paymentMethod = paymentMethod;
		this.amount = amount;
	}



	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getAccountNoFrom() {
		return accountNoFrom;
	}

	public void setAccountNoFrom(int accountNoFrom) {
		this.accountNoFrom = accountNoFrom;
	}

	public int getAccountNoTo() {
		return accountNoTo;
	}

	public void setAccountNoTo(int accountNoTo) {
		this.accountNoTo = accountNoTo;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	

}
