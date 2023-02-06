package com.luv2code.springboot.retailercoding.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.retailercoding.dao.CustomerRepository;
import com.luv2code.springboot.retailercoding.entity.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository theCustomerRepository) {
		
		customerRepository = theCustomerRepository;
	}
	
	@Override
	public List<Customer> findAll() {
		
		return customerRepository.findAll();
	}
	
	public Customer findById(int theId) {
		
		Optional<Customer> result = customerRepository.findById(theId);
		
		Customer theCustomer = null;
		
		if (result.isPresent()) {
			theCustomer = result.get();
		}
		else {
			
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return theCustomer;		
	}

}
