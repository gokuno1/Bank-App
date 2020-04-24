/*
 * package com.example.demo;
 * 
 * import org.springframework.cloud.openfeign.FeignClient; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable;
 * 
 * import com.example.demo.model.AccountDetails;
 * 
 * @FeignClient("account-service") public interface AccountProxy {
 * 
 * @GetMapping("/getbyaccName/{accountName}") public AccountDetails
 * getByAccName(@PathVariable String accountName); }
 */