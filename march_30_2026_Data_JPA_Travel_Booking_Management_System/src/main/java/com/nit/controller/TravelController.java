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
}
