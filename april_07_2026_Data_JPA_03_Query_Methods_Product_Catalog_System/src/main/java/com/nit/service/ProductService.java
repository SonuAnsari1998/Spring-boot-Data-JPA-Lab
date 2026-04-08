package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.entity.Product;
import com.nit.repo.IProductRepo;

@Component
public class ProductService implements IProductService {

	@Autowired
	IProductRepo iProductRepo;

	@Override
	public List<Product> findbyCategory(String category) {
		return iProductRepo.findbyCategory(category);
	}

	@Override
	public List<Product> findbyPriceLessThan(double amt) {
		return iProductRepo.findbyPriceLessThan(amt);
	}

	@Override
	public List<Product> findbyStockGreaterThanZero() {
		return iProductRepo.findbyStockGreaterThanZero();
	}
}
