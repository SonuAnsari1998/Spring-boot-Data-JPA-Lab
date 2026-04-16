package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
	private Integer oId;
	@Column(length = 20)
	private String product;
	@Column(length = 20)
	private String customer;
}
