package com.nit.task;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	//Find by name
	List<Product> findByName(String name);
	
	
	//Find products with quantity less than given value
	List<Product> findByQuantityLessThan(int quantity);
	
	
	//Find products between price range
	List<Product> findByPriceBetween(double min, double max);
	
}  
