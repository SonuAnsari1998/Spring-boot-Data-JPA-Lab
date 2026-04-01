package com.nit.entites;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "foodordersystem")
public class FoodOrder {
	@Id
	private Long id;
	@Column(length = 20)
	private String customerNam;
	@Column(length = 20)
	private String foodItem;
	private int quantity;
	private double pricePerItem;
	private double totalAmount;
}
