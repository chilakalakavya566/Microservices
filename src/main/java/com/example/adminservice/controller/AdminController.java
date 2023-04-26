package com.example.adminservice.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.adminservice.model.Account;
import com.example.adminservice.model.Branch;
import com.example.adminservice.model.CustomerDto;
import com.example.adminservice.model.Loans;
import com.example.adminservice.model.TransactionDetails;
import com.example.adminservice.service.AdminServiceImpl;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminServiceImpl service;
	
	
	
	
	
	@PostMapping("/addbranch")
	public Branch addBranch(@RequestBody Branch branch) {
		return service.addBranch(branch);
	}
	@DeleteMapping("/deletebranch/{branch_id}")
	public String deleteBranch(@PathVariable("branch_id") String branch_id) {
		return service.deleteBranch(branch_id);
	}
	@PostMapping("/addaccount")
	public Account addAccount(@RequestBody Account account) {
		return service.createAccount(account);
	}
	@DeleteMapping("/deleteaccount/{account_number}")
	public String deleteAccount(@PathVariable("account_number") String account_number) {
		return service.deleteAccount(account_number);
	}
	
	@GetMapping("/allbranches")
	public List<Branch> showAllBranches(){
		return service.showAllBranches();
	}
	
	@GetMapping("/allloans")
	public List<Loans> showAllLoans(){
		return service.showAllLoans();
	}
	
	@PostMapping("/applyloan")
	public Loans applyForLoan(@RequestBody Loans loan) {
		return service.applyForLoan(loan);
	}
	
	@PostMapping("/maketransaction")
	public TransactionDetails makeTransaction(@RequestBody TransactionDetails transactionDetails ) {
		return service.makeTransaction(transactionDetails);
		
	}
	

	@GetMapping("/searchbyNumDate/{account_number}")
	public List<TransactionDetails> searchByAccountNum(@PathVariable("account_number") String account_number) {
		// TODO Auto-generated method stub
		return service.searchByAccountNumber( account_number);
	}
	
	

}
