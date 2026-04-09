package com.nit.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nit.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
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
