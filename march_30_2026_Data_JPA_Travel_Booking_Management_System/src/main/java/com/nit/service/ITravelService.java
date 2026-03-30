package com.nit.service;

import java.util.Optional;

import com.nit.entity.Travel;

public interface ITravelService {
	void addTravel(Travel travel); // Adds a new travel booking.
	Iterable<Travel> getAllTravels(); // Retrieves all travel bookings.
	Optional<Travel> findTravelById(Long id); // Finds a travel booking by ID.
}
