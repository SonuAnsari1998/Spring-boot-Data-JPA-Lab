package com.nit.service;

import java.util.Optional;

import com.nit.entites.FoodOrder;

public interface IFoodOrderService {

	FoodOrder save(FoodOrder order);

	Iterable saveAll(Iterable<FoodOrder> orders);

	Optional<FoodOrder> findById(Long id);

	Iterable<FoodOrder> findAll();

	Iterable findAllById(Iterable<Long> ids);

	boolean existsById(Long id);

	void count();

	void deleteById(Long id);

	void delete(FoodOrder order);

	void deleteAllById(Iterable<Long> ids);

	void deleteAll(Iterable<? extends FoodOrder> orders);

	void deleteAll();
}
