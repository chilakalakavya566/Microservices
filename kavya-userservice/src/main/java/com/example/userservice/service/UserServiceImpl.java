package com.example.userservice.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userservice.dao.CustomerDao;
import com.example.userservice.model.Customer;
import com.example.userservice.model.LoansDto;
import com.example.userservice.model.TransactionDetailsDto;
import com.example.userservice.model.UserProxy;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	CustomerDao customerDao;
	@Autowired
	UserProxy userProxy;
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.save(customer);
	}

	@Override
	public LoansDto applyForLoan(LoansDto loan) {
		// TODO Auto-generated method stub
		return userProxy.applyForLoan(loan);
	}

	@Override
	public TransactionDetailsDto makeTransaction(TransactionDetailsDto transaction) {
		// TODO Auto-generated method stub
		return userProxy.makeTransaction(transaction);
	}

	@Override
	public Optional<TransactionDetailsDto> searchByAccountNumandDate(String account_number, Date date_of_transaction) {
		// TODO Auto-generated method stub
		return userProxy.searchByAccountNumandDate(account_number, date_of_transaction);
	}

	@Override
	public Optional<TransactionDetailsDto> searchByAccountNumandType(String account_number, String transaction_type) {
		// TODO Auto-generated method stub
		return userProxy.searchByAccountNumandType(account_number, transaction_type);
	}

	@Override
	public List<TransactionDetailsDto> searchByAccountNum(String account_number) {
		// TODO Auto-generated method stub
		return userProxy.searchByAccountNum(account_number);
	}

	@Override
	public String deleteCustomer(String CUSTOMER_NUMBER) {
		// TODO Auto-generated method stub
		customerDao.deleteById(CUSTOMER_NUMBER);
		return "customer deleted";
	}

	@Override
	public List<Customer> showAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.findAll();
	}

}
