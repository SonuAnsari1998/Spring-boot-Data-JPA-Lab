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
@Component
@Table(name = "EmployeeSearchSystem")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
	@Id
	int id;
	@Column(length = 20)
	String name;
	@Column(length = 20)
	String department;
	double salary;
	LocalDate joiningDate;
}
