package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.entity.Customer;
import com.nit.repo.CustomerRepository;

import jakarta.transaction.Transactional;

@Transactional
@Component
public class CustomerService implements ICustomerService{
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> fetchCustomer() {
		return customerRepository.findAll();
	}
	
	
}
