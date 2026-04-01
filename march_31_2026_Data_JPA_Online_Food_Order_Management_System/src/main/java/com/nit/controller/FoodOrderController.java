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
//1
	public FoodOrder save(FoodOrder order) {
		return foodOrderService.save(order);
	}
//2
	public Iterable saveAll(Iterable<FoodOrder> orders) {

		return foodOrderService.saveAll(orders);
	}
//3
	public Optional<FoodOrder> findById(Long id) {
		return foodOrderService.findById(id);
	}
//4
	public Iterable<FoodOrder> findAll() {
		return foodOrderService.findAll();
	}
//5
	public Iterable findAllById(Iterable<Long> ids) {
		return foodOrderService.findAllById(ids);
	}
//6
	public boolean existsById(Long id) {
		return foodOrderService.existsById(id);
	}
//7
	public void count() {
		foodOrderService.count();
	}
//8
	public void deleteById(Long id) {
		foodOrderService.deleteById(id);
	}
//9
	public void delete(FoodOrder order) {
		foodOrderService.delete(order);
	}
//10
	public void deleteAllById(Iterable<Long> ids) {
		foodOrderService.deleteAllById(ids);
	}
//11
	public void deleteAll(Iterable<? extends FoodOrder> orders) {
		foodOrderService.deleteAll();
	}
//12
	public void deleteAll() {
		foodOrderService.deleteAll();
	}

}
