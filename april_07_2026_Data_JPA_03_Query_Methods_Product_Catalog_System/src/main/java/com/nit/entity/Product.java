package com.nit.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ProductCatalogSystem")
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor 
public class Product {
	@Id
	int  id;
	@Column(length = 20)
	String name;
	@Column(length = 20)
	String category;
	double price;
	int stock;
}
