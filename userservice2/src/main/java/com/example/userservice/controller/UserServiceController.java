package com.example.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.userservice.model.Customer;
import com.example.userservice.model.LoansDto;
import com.example.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserServiceController {
	@Autowired
	UserService service; 
	
	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	
	@GetMapping("/allcustomers")
	public List<Customer> allCustomers(){
		return service.showAllCustomers();
		
	}
	@DeleteMapping("/deletecustomer/{CUSTOMER_NUMBER}")
	public String deleteCustomer(@PathVariable("CUSTOMER_NUMBER") String CUSTOMER_NUMBER ) {
		service.deleteCustomer(CUSTOMER_NUMBER);
		return "customer deleted";
	}
	@PostMapping("/applyloan")
	public LoansDto applyForLoan(@RequestBody LoansDto loan) {
		return service.applyForLoan(loan);
	}
}
