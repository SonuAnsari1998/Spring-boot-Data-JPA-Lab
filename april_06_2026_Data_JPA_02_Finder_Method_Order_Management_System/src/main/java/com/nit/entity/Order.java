package com.nit.entity;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "OrderManagementSystem")
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	@Id
	private int id;
	@Column(length = 20)
	private String customerName;
	@Column(length = 20)
	private String productName;
	private double amount;
	private LocalDate orderDate;
	@Column(length = 20)
	private String status;
}
