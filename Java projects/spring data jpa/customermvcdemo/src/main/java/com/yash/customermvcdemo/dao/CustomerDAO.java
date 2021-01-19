package com.yash.customermvcdemo.dao;

import java.util.List;

import com.yash.customermvcdemo.model.Customer;

public interface CustomerDAO {

	 public void save(Customer customer);
	 
	 public List<Customer> findAll();
	
}
