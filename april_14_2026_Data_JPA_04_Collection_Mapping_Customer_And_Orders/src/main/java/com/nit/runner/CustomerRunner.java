package com.nit.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Customer;
import com.nit.entity.Order;
import com.nit.service.CustomerService;

import jakarta.persistence.Column;
import jakarta.transaction.Transactional;

@Component
@Transactional
public class CustomerRunner implements CommandLineRunner {
	@Autowired
	CustomerService customerService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Customer & Orders");
		System.out.println("1. Add Customer and Order");
		System.out.println("2. Fetch Customer and Order Details");
		int choice = Integer.parseInt(IO.readln("Enter Your choice"));
		switch (choice) {
		case 1 -> {
			Integer id = Integer.parseInt(IO.readln("Enter Customer Id"));
			String name = IO.readln("Enter Cutomer name");
			List<Order> noOfOrder = new ArrayList<>();
			int noofO = Integer.parseInt(IO.readln("Enter Number of order want to add"));
			for (int i = 1; i <= noofO; i++) {
				System.out.println("Order No. "+i);
				Integer oid = Integer.parseInt(IO.readln("Enter Order id"));
				String product = IO.readln("Enter Product Name");
				String customer = IO.readln("Enter Customer name");
				Order order = new Order(oid, product, customer);
				noOfOrder.add(order);
			}
			Customer cust = new Customer(id, name, noOfOrder);
			customerService.addCustomer(cust);
			System.out.println("Added Sucessfully");
		}
		case 2 -> {
			customerService.fetchCustomer().forEach(IO::println);
		}

		default -> System.err.println("Invalid Choice");
		}
	}

}
