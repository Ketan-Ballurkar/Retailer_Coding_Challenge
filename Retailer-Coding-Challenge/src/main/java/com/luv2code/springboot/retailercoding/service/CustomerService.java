package com.luv2code.springboot.retailercoding.service;

import java.util.List;

import com.luv2code.springboot.retailercoding.entity.Customer;

public interface CustomerService {

	public List<Customer> findAll();
	
	public Customer findById(int theId);
}
