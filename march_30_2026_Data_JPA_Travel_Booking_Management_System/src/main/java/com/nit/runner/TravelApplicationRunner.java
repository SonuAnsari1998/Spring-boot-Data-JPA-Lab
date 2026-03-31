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
		System.out.println("1.Add a new travel booking.\r\n"
				+ "2.Retrieve all travel bookings.\r\n"
				+ "3.Find a travel booking by ID.\r\n"
				+ "4.Delete a travel booking by ID.\r\n"
				+ "5.Check if a travel booking exists.\r\n"
				+ "6.Count total travel bookings.\r\n"
				+ "7.Delete a specific travel booking.\r\n"
				+ "8.Delete all travel bookings.\r\n"
				+ "9.Exit.");
		int choice = Integer.parseInt(IO.readln("Enter Your choice!!!"));

		switch (choice) {
		case 1 -> {
			System.out.println("\nAdd New Travels");
			long id = Long.parseLong(IO.readln("Enter id"));
			String destination = IO.readln("Enter Designation");
			String transportationMode = IO.readln("Enter Transportation Mode");
			double price = Double.parseDouble(IO.readln("Enter Price"));
			Travel t = new Travel(id, destination, transportationMode, price);
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
		case 4->{
			long id = Long.parseLong(IO.readln("Enter id"));
			controller.deleteTravelById(id);
			System.out.println(id+" Deleted Sucessfully...");
			
		}
		case 5->{
			long id = Long.parseLong(IO.readln("Enter id"));
			boolean checkIfTravelExists = controller.checkIfTravelExists(id);
			if(checkIfTravelExists) {
				System.out.println(id+" Travel booking exists");
			}else {
				System.err.println(id+"Not Found");
			}	
		}
		case 6->{
			long countTravels = controller.countTravels();
			System.out.println("Total number of travel bookings."+countTravels);
		}
		case 7->{
			long id = Long.parseLong(IO.readln("Enter id"));
			String destination = IO.readln("Enter Designation");
			String transportationMode = IO.readln("Enter Transportation Mode");
			double price = Double.parseDouble(IO.readln("Enter Price"));
			Travel t = new Travel(id, destination, transportationMode, price);
			controller.deleteTravelObject(t);
		}
		case 8->{
			controller.deleteAllTravels();
			System.out.println("All travel bookings. Deleted Sucessfully");
		}
		case 9 -> {
			System.out.println("Thank you!!!");
			System.exit(0);
		}

		default -> System.err.println("Invalid choice Please Enter valid choice...");
		}

	}
}
