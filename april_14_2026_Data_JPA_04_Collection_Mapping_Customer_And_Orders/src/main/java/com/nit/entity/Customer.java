package com.nit.entity;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CustomerAndOrders12")
public class Customer {
	@Id
	Integer id;
	@Column(length = 20)
	String name;
	@ElementCollection
	@CollectionTable(name = "Order12", joinColumns = @JoinColumn(name = "id"))
	List<Order> orders;
}
