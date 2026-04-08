package com.nit.runner;

import java.util.List;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Product;
import com.nit.service.ProductService;
@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	ProductService productService;

	@Override
	public void run(String... args) throws Exception {
		IO.println("1. Find By Category");
		IO.println("2. Find By Price Less than Amount");
		IO.println("3. Find By Stock Greater Than Zero");
		int choice = Integer.parseInt(IO.readln("Enter Your Choice.."));
		switch (choice) {
		case 1 -> {
			String category = IO.readln("Enter Category");
			List<Product> findbyCategory = productService.findbyCategory(category);
			findbyCategory.forEach(IO::println);
		}
		case 2 -> {
			double amt = Double.parseDouble(IO.readln("Enter amount"));
			List<Product> findbyPriceLessThan = productService.findbyPriceLessThan(amt);
			findbyPriceLessThan.forEach(IO::println);
		}
		case 3 -> {
			List<Product> findbyStockGreaterThanZero = productService.findbyStockGreaterThanZero();
			findbyStockGreaterThanZero.forEach(IO::println);
		}
		default -> System.err.println("Invalid choice");
		}
	}
}
