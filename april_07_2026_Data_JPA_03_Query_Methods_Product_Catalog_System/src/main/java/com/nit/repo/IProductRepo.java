package com.nit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nit.entity.Product;

public interface IProductRepo extends JpaRepository<Product, Integer>{
	//Find products by category
	@Query("from Product where category=:category")
	List<Product> findbyCategory(String category);

	//Find products with price less than a given value
	@Query("from Product where price<=:amt")
	List<Product> findbyPriceLessThan(double amt);

	//Find products with stock greater than 0 (available products)
	@Query("from Product where stock >= 0")
	List<Product> findbyStockGreaterThanZero();
	

	//Find products by name containing a keyword (case-insensitive search)
	@Query("from Product p where lower(p.name) like lower(concat('%', :keyword, '%'))")
	List<Product> findbyNameContainingKeyword(String keyword);
}
