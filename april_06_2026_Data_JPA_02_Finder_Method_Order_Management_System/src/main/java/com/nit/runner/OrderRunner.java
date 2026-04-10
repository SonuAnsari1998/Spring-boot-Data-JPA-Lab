package com.nit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Order;
import com.nit.service.OrderService;

@Component
public class OrderRunner implements CommandLineRunner {
	@Autowired
	OrderService orderService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n===== ORDER MENU =====");
		System.out.println("1. Find by Customer Name");
		System.out.println("2. Find by Status");
		System.out.println("3. Find by Amount Greater Than");
		System.out.println("4. Find by Amount Between");
		System.out.println("5. Find by Order Date After");
		System.out.println("6. Find by Order Date Between");
		System.out.println("7. Find by Status and Amount Greater Than");
		System.out.println("8. Find by Product Name Containing");
		System.out.println("9. Find Top 5 Recent Orders");
		System.out.println("10. Find by Status In");
		System.out.println("0. Exit");
		int choice = Integer.parseInt(IO.readln("Enter Your choice"));
		switch(choice) {
		case 1->{
			String customerName = IO.readln("Enter Customer name want to find");
				List<Order> byCustomerName = orderService.findByCustomerName(customerName);
				byCustomerName.forEach(IO::println);
		}
		case 2->{
			
		}
		case 3->{
			
		}
		case 4->{
			
		}
		case 5->{
			
		}
		case 6->{
			
		}
		case 7->{
			
		}
		case 8->{
			
		}
		case 9->{
			
		}
		case 10->{
			
		}
		case 0->{
			
		}
		
		default -> System.err.println("Invalid choice");
		}
	}

}
