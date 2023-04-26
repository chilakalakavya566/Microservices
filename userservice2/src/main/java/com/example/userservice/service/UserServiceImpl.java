package com.example.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userservice.dao.CustomerDao;
import com.example.userservice.model.AdminProxy;
import com.example.userservice.model.Customer;
import com.example.userservice.model.LoansDto;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	CustomerDao customerDao;
	
	@Autowired
	AdminProxy adminProxy;
	@Override
	public void deleteCustomer(String CUSTOMER_NUMBER) {
		// TODO Auto-generated method stub
		customerDao.deleteById(CUSTOMER_NUMBER);
		
	}

	@Override
	public List<Customer> showAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.save(customer);
	}

	@Override
	public LoansDto applyForLoan(LoansDto loan) {
		// TODO Auto-generated method stub
		return adminProxy.applyForLoan(loan);
	}

}
