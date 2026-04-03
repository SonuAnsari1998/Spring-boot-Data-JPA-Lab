package com.nit.entity;

import org.hibernate.annotations.Comment;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EmployeeManagementSystem")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
	@Id
	private int empId;
	@Column(length = 20)
	private String empName;
	@Column(length = 20)
	private String department;
	private double salary;
}
