package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.models.AccountInfo;
import com.example.demo.models.TransactionModel;

@FeignClient("account-service")
public interface AccountProxy {
	
	@GetMapping("/accountservice/getbyaccno/{accountNumber}")
	public AccountInfo getByAccNo(@PathVariable int accountNumber);

	@PutMapping("accountservice/update")
	public void updateDetails(@RequestBody AccountInfo account);
}
