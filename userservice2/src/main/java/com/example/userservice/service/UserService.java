package com.example.userservice.service;

import java.util.List;

import com.example.userservice.model.Customer;
import com.example.userservice.model.LoansDto;


public interface UserService {
	public void deleteCustomer(String CUSTOMER_NUMBER);
	public List<Customer> showAllCustomers();
	public Customer addCustomer(Customer customer);
	
	public LoansDto applyForLoan(LoansDto loan);

}
