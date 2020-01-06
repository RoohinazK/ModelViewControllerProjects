package com.example.debitcardcustomer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.debitcardcustomer.entity.Customer;

@Service
public interface CustomerService {

	/**
	 * @param customer
	 */
	public void saveDetails(Customer customer);

	/**
	 * @return all the customers
	 */
	public List<Customer> getAllCustomers();

	/**
	 * @return all the customers
	 */
	public List<Customer> getAllCustomers1();
}