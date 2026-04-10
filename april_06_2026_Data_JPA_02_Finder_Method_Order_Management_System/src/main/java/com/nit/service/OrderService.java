package com.nit.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.entity.Order;
import com.nit.repo.OrderRepository;
@Component
public class OrderService implements IOrderService{
	@Autowired
	OrderRepository iOrderService;

	@Override
	public List<Order> findByCustomerName(String name) {
		return iOrderService.findByCustomerName(name);
	}

	@Override
	public List<Order> findByStatus(String status) {
		return iOrderService.findByStatus(status);
	}

	@Override
	public List<Order> findByAmountGreaterThan(Double amount) {
		return iOrderService.findByAmountGreaterThan(amount);
	}

	@Override
	public List<Order> findByAmountBetween(Double min, Double max) {
		return iOrderService.findByAmountBetween(min, max);
	}

	@Override
	public List<Order> findByOrderDateAfter(LocalDate date) {
		return iOrderService.findByOrderDateAfter(date);
	}

	@Override
	public List<Order> findByOrderDateBetween(LocalDate start, LocalDate end) {
		return iOrderService.findByOrderDateBetween(start, end);
	}

	@Override
	public List<Order> findByStatusAndAmountGreaterThan(String status, Double amount) {
		return iOrderService.findByStatusAndAmountGreaterThan(status, amount);
	}

	@Override
	public List<Order> findByProductNameContaining(String keyword) {
		return iOrderService.findByProductNameContaining(keyword);
	}

	@Override
	public List<Order> findTop5ByOrderByOrderDateDesc() {
		return iOrderService.findTop5ByOrderByOrderDateDesc();
	}

	@Override
	public List<Order> findByStatusIn(List<String> statusList) {
		return iOrderService.findByStatusIn(statusList);
	}

}

























