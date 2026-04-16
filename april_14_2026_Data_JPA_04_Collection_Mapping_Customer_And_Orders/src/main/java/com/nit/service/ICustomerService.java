package com.nit.service;

import java.util.List;

import com.nit.entity.Customer;

public interface ICustomerService {
	Customer addCustomer(Customer customer);
	List<Customer> fetchCustomer();
}
