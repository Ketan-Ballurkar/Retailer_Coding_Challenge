package com.luv2code.springboot.retailercoding.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.retailercoding.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
