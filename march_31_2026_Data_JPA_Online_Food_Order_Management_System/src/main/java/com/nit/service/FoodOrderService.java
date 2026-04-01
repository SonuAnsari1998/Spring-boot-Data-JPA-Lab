package com.nit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entites.FoodOrder;
import com.nit.repo.FoodOrderRepository;

@Service
public class FoodOrderService implements IFoodOrderService {

	private final FoodOrder foodOrder;
	@Autowired
	private FoodOrderRepository repo;

	FoodOrderService(FoodOrder foodOrder) {
		this.foodOrder = foodOrder;
	}

	private FoodOrder applyBusinessLogic(FoodOrder order) {
		if (order.getQuantity() <= 0 || order.getPricePerItem() <= 0) {
			System.out.println("Invalid quantity or price");
		}

		double total = order.getQuantity() * order.getPricePerItem();

		if (order.getQuantity() > 5) {
			total *= 0.9;
		}

		if (total > 1000) {
			total -= 100;
		}
		order.setTotalAmount(total);
		
		return order;
	}

	@Override
	public FoodOrder save(FoodOrder order) {
		FoodOrder or = applyBusinessLogic(order);
		
		return repo.save(or);
	}

	@Override
	public Iterable saveAll(Iterable<FoodOrder> orders) {
		for (FoodOrder order : orders) {
			applyBusinessLogic(order);
		}
		return repo.saveAll(orders);
	}

	@Override
	public Optional<FoodOrder> findById(Long id) {
		return repo.findById(id);
	}

	@Override
	public Iterable<FoodOrder> findAll() {
		return repo.findAll();
	}

	@Override
	public Iterable findAllById(Iterable<Long> ids) {
		return repo.findAllById(ids);
	}

	@Override
	public boolean existsById(Long id) {
		return repo.existsById(id);
	}

	@Override
	public void count() {
		long count = repo.count();
		System.out.println("Total Food Order: " + count);
	}

	@Override
	public void deleteById(Long id) {
		repo.deleteById(id);
		System.out.println("Id: " + id + " Deleted Sucessfully..");
	}

	@Override
	public void delete(FoodOrder order) {
		repo.delete(order);
		System.out.println(order + " Deleted Sucessfully..");
	}

	@Override
	public void deleteAllById(Iterable<Long> ids) {
		repo.deleteAllById(ids);
		System.out.println(ids + " Deleted Sucessfully..");
	}

	@Override
	public void deleteAll(Iterable<? extends FoodOrder> orders) {
		repo.deleteAll(orders);
		System.out.println(orders + " Deleted Sucessfully..");
	}

	@Override
	public void deleteAll() {
		repo.deleteAll();
		System.out.println("All Deleted Sucessfully..");
	}
}
