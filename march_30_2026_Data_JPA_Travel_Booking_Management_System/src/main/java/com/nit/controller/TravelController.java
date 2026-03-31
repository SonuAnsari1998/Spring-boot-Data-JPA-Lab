package com.nit.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.entity.Travel;
import com.nit.service.TravelService;

@Controller
public class TravelController {

	@Autowired
	TravelService travelService;

	public void addTravel(Travel travel) { // Prompts the user for travel details and saves the booking.
		travelService.addTravel(travel);
	}

	public Iterable retrieveAllTravels() { // Lists all travel bookings.
		return travelService.getAllTravels();
	}

	public Optional<Travel> findTravelById(Long id) { // Finds and displays a travel booking by its ID.
		return travelService.findTravelById(id);
	}

	public void deleteTravelById(Long id) { // : Deletes a travel booking by ID.
		travelService.deleteTravelById(id);
	}

	public boolean checkIfTravelExists(Long id) { // Checks if a travel booking exists.
		return travelService.existsById(id);
	}

	public long countTravels() { // Retrieves the total number of travel bookings.
		return travelService.count();
	}

	public void deleteTravelObject(Travel travel) { // Deletes a specific travel booking.
		travelService.delete(travel);
	}

	public void deleteAllTravels() { // Deletes all travel bookings.
		travelService.deleteAll();
	}
}























