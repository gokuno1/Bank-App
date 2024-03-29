package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.models.AccountInfo;

@Repository
public interface AccountRepository extends JpaRepository<AccountInfo, Integer> {
	
	@Query("select a from AccountInfo a where a.accountName = :accountName")
	public AccountInfo findByaccountName(@Param("accountName") String accountName);

}
