package com.nit.service;

import java.time.LocalDate;
import java.util.List;

import com.nit.entity.Order;

public interface IOrderService {
	List<Order> findByCustomerName(String name);

	List<Order> findByStatus(String status);

	List<Order> findByAmountGreaterThan(Double amount);

	List<Order> findByAmountBetween(Double min, Double max);

	List<Order> findByOrderDateAfter(LocalDate date);

	List<Order> findByOrderDateBetween(LocalDate start, LocalDate end);

	List<Order> findByStatusAndAmountGreaterThan(String status, Double amount);

	List<Order> findByProductNameContaining(String keyword);

	List<Order> findTop5ByOrderByOrderDateDesc();

	List<Order> findByStatusIn(List<String> statusList);
}
