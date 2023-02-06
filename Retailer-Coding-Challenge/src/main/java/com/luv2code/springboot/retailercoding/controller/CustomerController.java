package com.luv2code.springboot.retailercoding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.retailercoding.entity.Customer;
import com.luv2code.springboot.retailercoding.service.CustomerService;

@Controller
@RequestMapping("/retailer")
public class CustomerController {


	private CustomerService customerService;
	
	public CustomerController(CustomerService theCustomerService) {
		
		customerService = theCustomerService;
	}
	
	@GetMapping("/rewards")
	public String listCustomersAndTransactions(Model theModel) {
		
		List<Customer> theCustomer = 
				customerService.findAll();
		
		theModel.addAttribute("customers", theCustomer);
		
		return "ListOfCustomersandTransactions";
	}
	
	@GetMapping("/rewards/{id}")
	public String listCustomersAndTransactionsById(@PathVariable int id, Model theModel) {
		
        Customer theCustomerById = customerService.findById(id);
        
        theModel.addAttribute("customers", theCustomerById);
		
		return "ListOfCustomersandTransactionsById";
	}

}
