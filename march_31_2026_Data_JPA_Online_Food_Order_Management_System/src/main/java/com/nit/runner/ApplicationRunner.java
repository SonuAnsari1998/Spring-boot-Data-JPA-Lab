package com.nit.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.controller.FoodOrderController;
import com.nit.entites.FoodOrder;

@Component
public class ApplicationRunner implements CommandLineRunner {
	private final FoodOrder foodOrder;
	@Autowired
	FoodOrderController controller;

	ApplicationRunner(FoodOrder foodOrder) {
		this.foodOrder = foodOrder;
	}

	@Override
	public void run(String... args) throws Exception {
		IO.println("Online Food Order Management System");
		IO.println("1. Add Order\r\n" + "2. Add Multiple Orders\r\n" + "3. View All Orders\r\n"
				+ "4. View Orders by IDs\r\n" + "5. Find Order by ID\r\n" + "6. Check Order Exists\r\n"
				+ "7. Count Orders\r\n" + "8. Delete Order by ID\r\n" + "9. Delete Orders by IDs\r\n"
				+ "10. Delete Specific Order\r\n" + "11. Delete Selected Orders\r\n" + "12. Delete All Orders\r\n"
				+ "13. Exit");
		int choice = Integer.parseInt(IO.readln("Enter Your Choice..."));
		switch (choice) {
		case 1 -> {
			long id = Long.parseLong(IO.readln("Enter Food id"));
			String customerNam = IO.readln("Enter Customer Name");
			String foodItem = IO.readln("Enter Food Item");
			int quantity = Integer.parseInt(IO.readln("Enter Food Qty"));
			double pricePerItem = Double.parseDouble(IO.readln("Enter Price per item"));
			double totalAmount = Double.parseDouble(IO.readln("Enter total Amount"));
			FoodOrder food = new FoodOrder(id, customerNam, foodItem, quantity, pricePerItem, totalAmount);
			FoodOrder save = controller.save(food);
			System.out.println(save);
			System.out.println("Food Added Sucessfully");
		}
		case 2 -> {
			int noOfItem = Integer.parseInt(IO.readln("Enter No. of items"));
			List<FoodOrder> food = new ArrayList<>();
			for (int i = 1; i <= noOfItem; i++) {
				long id = Long.parseLong(IO.readln("Enter Food id"));
				String customerNam = IO.readln("Enter Customer Name");
				String foodItem = IO.readln("Enter Food Item");
				int quantity = Integer.parseInt(IO.readln("Enter Food Qty"));
				double pricePerItem = Double.parseDouble(IO.readln("Enter Price per item"));
				double totalAmount = Double.parseDouble(IO.readln("Enter total Amount"));
				FoodOrder food1 = new FoodOrder(id, customerNam, foodItem, quantity, pricePerItem, totalAmount);
				food.add(food1);
			}
			controller.saveAll(food);
		}
		case 3 -> {
			long id = Long.parseLong(IO.readln("Enter Food id"));
			Optional<FoodOrder> byId = controller.findById(id);
			System.out.println(byId);
		}
		case 4 -> {
			Iterable<FoodOrder> all = controller.findAll();
			all.forEach(IO::println);
		}
		case 5 -> {
			int findNoOfOrder = Integer.parseInt(IO.readln("Enter no of order to find"));
			List<Long> food = new ArrayList<>();
			for (int i = 1; i <= findNoOfOrder; i++) {
				long id = Long.parseLong(IO.readln("Enter Food id"));
				food.add(id);
			}
			controller.findAllById(food);
		}
		case 6 -> {
			long id = Long.parseLong(IO.readln("Enter Food id"));
			boolean existsById = controller.existsById(id);
			if (existsById) {
				System.out.println("id: " + id + " Found");
			} else {
				System.err.println(id + " Not found");
			}
		}
		case 7 -> {
			controller.count();
		}
		case 8 -> {
			long id = Long.parseLong(IO.readln("Enter Food id"));
			controller.deleteById(id);
		}
		case 9 -> {
			controller.delete(foodOrder);
		}
		case 10 -> {
			long id = Long.parseLong(IO.readln("Enter Food id"));
			String customerNam = IO.readln("Enter Customer Name");
			String foodItem = IO.readln("Enter Food Item");
			int quantity = Integer.parseInt(IO.readln("Enter Food Qty"));
			double pricePerItem = Double.parseDouble(IO.readln("Enter Price per item"));
			double totalAmount = Double.parseDouble(IO.readln("Enter total Amount"));
			FoodOrder food = new FoodOrder(id, customerNam, foodItem, quantity, pricePerItem, totalAmount);
			controller.delete(food);

		}
		case 11 -> {
			controller.deleteAll(null);
			
		}
		case 12 -> {
			int noOfItem = Integer.parseInt(IO.readln("Enter No. of items"));
			List<FoodOrder> food = new ArrayList<>();
			for (int i = 1; i <= noOfItem; i++) {
				long id = Long.parseLong(IO.readln("Enter Food id"));
				String customerNam = IO.readln("Enter Customer Name");
				String foodItem = IO.readln("Enter Food Item");
				int quantity = Integer.parseInt(IO.readln("Enter Food Qty"));
				double pricePerItem = Double.parseDouble(IO.readln("Enter Price per item"));
				double totalAmount = Double.parseDouble(IO.readln("Enter total Amount"));
				FoodOrder food1 = new FoodOrder(id, customerNam, foodItem, quantity, pricePerItem, totalAmount);
				food.add(food1);
			}
			controller.deleteAll(food);
			
		}
		case 13 -> {
			IO.println("Thank you!! vist again");
			System.exit(0);
		}
		default -> System.err.println("Invalid choice pls Enter valid choice");
		}

	}
}
