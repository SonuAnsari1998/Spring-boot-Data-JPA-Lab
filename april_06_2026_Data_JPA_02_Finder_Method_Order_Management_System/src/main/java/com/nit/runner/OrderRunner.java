package com.nit.runner;

import java.time.LocalDate;
import java.util.ArrayList;
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
		switch (choice) {
		case 1 -> {
			String customerName = IO.readln("Enter Customer name want to find");
			List<Order> byCustomerName = orderService.findByCustomerName(customerName);
			byCustomerName.forEach(IO::println);
		}
		case 2 -> {
			String status = IO.readln("Enter status");
			List<Order> byStatus = orderService.findByStatus(status);
			byStatus.forEach(IO::println);
		}
		case 3 -> {
			double amt = Double.parseDouble(IO.readln("Enter Amount"));
			List<Order> byAmountGreaterThan = orderService.findByAmountGreaterThan(amt);
			byAmountGreaterThan.forEach(IO::println);
		}
		case 4 -> {
			double min = Double.parseDouble(IO.readln("Enter Min Amount"));
			double max = Double.parseDouble(IO.readln("Enter Max Amount"));
			List<Order> byAmountBetween = orderService.findByAmountBetween(min, max);
			byAmountBetween.forEach(IO::println);
		}
		case 5 -> {
			LocalDate date = LocalDate.parse(IO.readln("Enter Date (YYYY-MM-DD)"));
			List<Order> byOrderDateAfter = orderService.findByOrderDateAfter(date);
			byOrderDateAfter.forEach(IO::println);
		}
		case 6 -> {
			LocalDate startDate = LocalDate.parse(IO.readln("Enter Start Date (YYYY-MM-DD)"));
			LocalDate endDate = LocalDate.parse(IO.readln("Enter End Date (YYYY-MM-DD)"));
			List<Order> byOrderDateBetween = orderService.findByOrderDateBetween(startDate, endDate);
			byOrderDateBetween.forEach(IO::println);
		}
		case 7 -> {
			String status = IO.readln("Enter status");
			double amt = Double.parseDouble(IO.readln("Enter Amount"));
			List<Order> byStatusAndAmountGreaterThan = orderService.findByStatusAndAmountGreaterThan(status, amt);
			byStatusAndAmountGreaterThan.forEach(IO::println);
		}
		case 8 -> {
			String key = IO.readln("Enter keyword");
			List<Order> byProductNameContaining = orderService.findByProductNameContaining(key);
			byProductNameContaining.forEach(IO::println);
		}
		case 9 -> {
			List<Order> top5ByOrderByOrderDateDesc = orderService.findTop5ByOrderByOrderDateDesc();
			top5ByOrderByOrderDateDesc.forEach(IO::println);
		}
		case 10 -> {
			List<String> list = new ArrayList<String>();
			int ch = Integer.parseInt(IO.readln("Enter how many status search"));
			for (int i = 1; i <= ch; i++) {
				String st = IO.readln("Enter status " + i);
				list.add(st);
			}
		}
		case 0 -> {
			System.out.println("Thank You!!!");
			System.exit(0);
		}

		default -> System.err.println("Invalid choice");
		}
	}

}
