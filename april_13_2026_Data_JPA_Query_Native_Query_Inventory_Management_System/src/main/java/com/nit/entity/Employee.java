package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EmployeeAnalyticsSystem")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
	@Id
	Long id;
	@Column(length = 20)
	String name;
	@Column(length = 20)
	String department;
	double salary;
	@Column(length = 20)
	String designation;
}
