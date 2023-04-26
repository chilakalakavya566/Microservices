package com.example.adminservice.service;

import java.sql.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.adminservice.dao.AccountDao;
import com.example.adminservice.dao.BranchDao;
import com.example.adminservice.dao.LoansDao;
import com.example.adminservice.dao.TransactionDao;
import com.example.adminservice.model.Account;

import com.example.adminservice.model.Branch;
import com.example.adminservice.model.CustomerDto;
import com.example.adminservice.model.Loans;
import com.example.adminservice.model.TransactionDetails;


@Service
public class AdminServiceImpl implements AdminService {

	//@Autowired
	//CustomerDao customerDao;
	@Autowired
	AccountDao accountDao;	
	@Autowired
	BranchDao branchDao;	
	@Autowired
	LoansDao loansDao;	
	@Autowired
	TransactionDao transactionDao;
	
	
	

	@Override
	public Branch addBranch(Branch branch) {
		// TODO Auto-generated method stub
		return branchDao.save(branch);
	}

	@Override
	public String deleteBranch(String branch_id) {
		// TODO Auto-generated method stub
		branchDao.deleteById(branch_id);
		return "branch deleted";
	}

	@Override
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.save(account);
	}

	@Override
	public String deleteAccount(String account_number) {
		// TODO Auto-generated method stub
		accountDao.deleteById(account_number);
		return "account deleted";
	}

	

	@Override
	public List<Branch> showAllBranches() {
		// TODO Auto-generated method stub
		return branchDao.findAll();
	}

	@Override
	public List<Loans> showAllLoans() {
		// TODO Auto-generated method stub
		return loansDao.findAll();
	}

	@Override
	public Loans applyForLoan(Loans loan) {
		// TODO Auto-generated method stub
		return loansDao.save(loan);
	}

	@Override
	public TransactionDetails makeTransaction(TransactionDetails transaction) {
		// TODO Auto-generated method stub
		return transactionDao.save(transaction);
	}

	

	@Override
	public List<TransactionDetails> searchByAccountNumber(String account_number) {
		// TODO Auto-generated method stub
		return transactionDao.searchByAccountNumber( account_number);
	}

	

}
