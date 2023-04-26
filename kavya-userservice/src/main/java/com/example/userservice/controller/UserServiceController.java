package com.example.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userservice.model.Customer;
import com.example.userservice.service.UserService;

@RestController
@RequestMapping(name="user")
public class UserServiceController {
	
	@Autowired
	UserService service; 
	
	@GetMapping("/addcustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	
	@GetMapping("/allcustomers")
	public List<Customer> allCustomers(){
		return service.showAllCustomers();
		
	}
	@DeleteMapping("/deletecustomer")
	public String deleteCustomer(String CUSTOMER_NUMBER ) {
		service.deleteCustomer(CUSTOMER_NUMBER);
		return "customer deleted";
	}

}
