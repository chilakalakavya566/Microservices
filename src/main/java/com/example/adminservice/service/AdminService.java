package com.example.adminservice.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.example.adminservice.model.Account;
import com.example.adminservice.model.Branch;
import com.example.adminservice.model.CustomerDto;
import com.example.adminservice.model.Loans;
import com.example.adminservice.model.TransactionDetails;



public interface AdminService {
	
	
	
	public Branch addBranch(Branch branch);
	public String deleteBranch(String branch_id);
	public Account createAccount(Account account);
	public String deleteAccount(String account_number);
	
	public List<Branch> showAllBranches();
	public List<Loans> showAllLoans();
	
	public Loans applyForLoan(Loans loan);
	public TransactionDetails makeTransaction(TransactionDetails transaction);
	//public Optional<TransactionDetails> searchByAccountNumandDate(String  account_number,Date  date_of_transaction);
	//public Optional<TransactionDetails> searchByAccountNumandType(String  account_number,String  transaction_type);
	public List<TransactionDetails> searchByAccountNumber(String  account_number);

}
