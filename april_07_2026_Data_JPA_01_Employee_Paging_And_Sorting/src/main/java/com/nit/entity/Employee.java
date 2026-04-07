package com.nit.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "EmployeePagingAndShorting")
@Component
@Data
public class Employee {
	@Id
	Long id;
	@Column(length = 20)
	String name;
	@Column(length = 20)
	String designation;
	double salary;
}
