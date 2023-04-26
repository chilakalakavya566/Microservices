package com.example.userservice.model;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("ADMIN-SERVICE/admin")
public interface UserProxy {
	@GetMapping("/applyloan")
	public LoansDto applyForLoan(@RequestBody LoansDto loan);
	
	@PostMapping("/maketransaction")
	public TransactionDetailsDto makeTransaction(@RequestBody TransactionDetailsDto transactionDetails ) ;

	@GetMapping("/searchbyNumDate/{account_number}/{date_of_transaction}")
	public Optional<TransactionDetailsDto> 
			searchByAccountNumandDate(@PathVariable("account_number") 
			String account_number,@PathVariable("date_of_transaction") Date date_of_transaction);
	
	@GetMapping("/searchbyNumDate/{account_number}/{transaction_type}")
	public Optional<TransactionDetailsDto> 
	searchByAccountNumandType(@PathVariable("account_number")
	String account_number,@PathVariable("transaction_type")  String transaction_type);
	
	@GetMapping("/searchbyNumDate/{account_number}")
	public List<TransactionDetailsDto> searchByAccountNum(@PathVariable("account_number") String account_number);
}
