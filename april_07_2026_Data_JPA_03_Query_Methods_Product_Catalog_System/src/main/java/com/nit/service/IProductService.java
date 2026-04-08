package com.nit.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.nit.entity.Product;

public interface IProductService {
	List<Product> findbyCategory(String category);

	List<Product> findbyPriceLessThan(double amt);

	List<Product> findbyStockGreaterThanZero();

}
