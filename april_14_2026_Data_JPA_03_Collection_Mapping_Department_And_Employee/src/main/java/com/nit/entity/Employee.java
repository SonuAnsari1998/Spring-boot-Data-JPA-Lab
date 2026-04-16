package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Column(length = 20)
	private Integer eId;
	@Column(length = 20)
	private String name;
}
