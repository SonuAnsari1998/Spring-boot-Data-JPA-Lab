package com.nit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Travel;
import com.nit.repo.TravelRepository;

@Service
public class TravelService implements ITravelService {

	@Autowired
	TravelRepository travelRepository;

	@Override
	public void addTravel(Travel travel) {
		travelRepository.save(travel);

	}

	@Override
	public Iterable<Travel> getAllTravels() {
		return travelRepository.findAll();
	}

	@Override
	public Optional<Travel> findTravelById(Long id) {
		return travelRepository.findById(id);
	}

}
