package com.nit.runner;

import java.util.Optional;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.controller.TravelController;
import com.nit.entity.Travel;

@Component
public class TravelApplicationRunner implements CommandLineRunner {
	@Autowired
	TravelController controller;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Travel Booking Management System");
		System.out.println("1.Add a new travel booking.\r\n" + "2.Retrieve all travel bookings.\r\n"
				+ "3.Find a travel booking by ID.\r\n" + "4.Exit.");
		int choice = Integer.parseInt(IO.readln("Enter Your choice!!!"));

		switch (choice) {
		case 1 -> {
			System.out.println("\nAdd New Travels");
			long id = Long.parseLong(IO.readln("Enter id"));
			String destination = IO.readln("Enter Designation");
			String transportationMode = IO.readln("Enter Transportation Mode");
			double price = Double.parseDouble(IO.readln("Enter Price"));
			Travel t = new Travel(id, destination, transportationMode, price);
			controller.addTravel(t);
			System.out.println("Travels id "+ id+" Added Sucessfully!!!");
		}
		case 2 -> {
			System.out.println("\nAll Travels Details");
			Iterable allTravels = controller.retrieveAllTravels();
			allTravels.forEach(IO::println);

		}
		case 3 -> {
			long id = Long.parseLong(IO.readln("Enter id"));
			Optional<Travel> travelById = controller.findTravelById(id);
			System.out.println(travelById);
			

		}
		case 4 -> {
			System.out.println("Thank you!!!");
			System.exit(0);
		}

		default -> System.err.println("Invalid choice Please Enter valid choice...");
		}

	}
}
