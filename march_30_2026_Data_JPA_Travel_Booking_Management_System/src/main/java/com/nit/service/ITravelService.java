package com.nit.service;

import java.util.Optional;

import com.nit.entity.Travel;

public interface ITravelService {
	void addTravel(Travel travel); // Adds a new travel booking.
	Iterable<Travel> getAllTravels(); // Retrieves all travel bookings.
	Optional<Travel> findTravelById(Long id); // Finds a travel booking by ID.
	
	
	void deleteTravelById(Long id);		// Deletes a travel booking by ID.
	boolean existsById(Long id);		// Checks if a travel booking exists by ID.
	long count();						// Returns the total number of travel bookings.
	void delete(Travel travel);			// Deletes a specific travel booking object.
	void deleteAll();					// Deletes all travel bookings.
}
