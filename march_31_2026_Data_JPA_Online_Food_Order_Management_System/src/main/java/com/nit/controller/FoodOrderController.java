package com.nit.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.entites.FoodOrder;
import com.nit.service.FoodOrderService;

@Controller
public class FoodOrderController {
	@Autowired
	FoodOrderService foodOrderService;

	public FoodOrder save(FoodOrder order) {
		return foodOrderService.save(order);
	}

	public Iterable saveAll(Iterable<FoodOrder> orders) {

		return foodOrderService.saveAll(orders);
	}

	public Optional<FoodOrder> findById(Long id) {
		return foodOrderService.findById(id);
	}

	public Iterable<FoodOrder> findAll() {
		return foodOrderService.findAll();
	}

	public Iterable findAllById(Iterable<Long> ids) {
		return foodOrderService.findAllById(ids);
	}

	public boolean existsById(Long id) {
		return foodOrderService.existsById(id);
	}

	public void count() {
		foodOrderService.count();
	}

	public void deleteById(Long id) {
		foodOrderService.deleteById(id);
	}

	public void delete(FoodOrder order) {
		foodOrderService.delete(order);
	}

	public void deleteAllById(Iterable<Long> ids) {
		foodOrderService.deleteAllById(ids);
	}

	public void deleteAll(Iterable<? extends FoodOrder> orders) {
		foodOrderService.deleteAll();
	}

	public void deleteAll() {
		foodOrderService.deleteAll();
	}

}
