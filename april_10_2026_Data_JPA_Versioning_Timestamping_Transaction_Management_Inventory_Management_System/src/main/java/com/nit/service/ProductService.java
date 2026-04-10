package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Product;
import com.nit.exception.InsufficientStockException;
import com.nit.task.ProductRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService implements IProductService {
	@Autowired
	ProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public List<Product> viewAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public void updateProductPrice(Long id, double newPrice) {
		Optional<Product> byId = productRepository.findById(id);
		if (byId.isPresent()) {
			Product product = byId.get();
			product.setPrice(newPrice);
			productRepository.save(product);
			System.out.println("Product Added Sucessfully!!!");
		} else {
			System.out.println(id + "Not Found");
		}
	}

	@Override
	public void purchaseProduct(Long id, int qty) {
		Optional<Product> byId = productRepository.findById(id);
		byId.isPresent();
		Product product = byId.get();
		if (product.getQuantity() > qty) {
			product.setQuantity(product.getQuantity() - qty);
			productRepository.save(product);
		} else {
			throw new InsufficientStockException("Stock is not availabe");
		}
	}

	@Override
	public void bulkUpdatePrice() {

		productRepository.findAll().forEach(p -> {
			double newPrice = p.getPrice() * 1.10;
			p.setPrice(newPrice);
		});

		productRepository.saveAll(productRepository.findAll());
	}

	@Override
	public void deleteProduct(Long id) {
		Optional<Product> byId = productRepository.findById(id);
		if (byId.isPresent()) {
			productRepository.deleteById(id);
		} else {
			throw new InsufficientStockException(id + " not found");
		}
	}

	@Override
	public List<Product> findByName(String name) {
		return productRepository.findByName(name);
	}

	@Override
	public List<Product> findByQuantityLessThan(int quantity) {
		return productRepository.findByQuantityLessThan(quantity);
	}

	@Override
	public List<Product> findByPriceBetween(double min, double max) {
		return productRepository.findByPriceBetween(min, max);
	}

}
