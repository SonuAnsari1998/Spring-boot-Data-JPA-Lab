package com.nit.service;

import java.util.List;

import com.nit.entity.Product;

public interface IProductService {	
	
	void addProduct(Product product);
	
	List<Product> viewAllProducts();
	
	void updateProductPrice(Long id, double newPrice);
	
	void purchaseProduct(Long id, int qty);
	
	void bulkUpdatePrice();
	
	void deleteProduct(Long id);
	
	List<Product> findByName(String name);

	List<Product> findByQuantityLessThan(int quantity);

	List<Product> findByPriceBetween(double min, double max);
}
