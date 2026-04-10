package com.nit.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Inventory_Management_System")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Product {

	@Id
	Long id;
	@Column(length = 20)
	String name;
	double price;
	int quantity;
	@Version
	int version;
	@CreationTimestamp
	@Column(length = 20)
	LocalDateTime createdAt;
	@UpdateTimestamp
	@Column(length = 20)
	LocalDateTime updatedAt;
}
