package com.example.userservice.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.example.userservice.model.Customer;
import com.example.userservice.model.LoansDto;
import com.example.userservice.model.TransactionDetailsDto;

public interface UserService {

	public Customer addCustomer(Customer customer);
	public LoansDto applyForLoan(LoansDto loan);
	public TransactionDetailsDto makeTransaction(TransactionDetailsDto transaction);
	public Optional<TransactionDetailsDto> searchByAccountNumandDate(String  account_number,Date  date_of_transaction);
	public Optional<TransactionDetailsDto> searchByAccountNumandType(String  account_number,String  transaction_type);
	public List<TransactionDetailsDto> searchByAccountNum(String  account_number);
	
	public String deleteCustomer(String CUSTOMER_NUMBER);
	public List<Customer> showAllCustomers();
}
