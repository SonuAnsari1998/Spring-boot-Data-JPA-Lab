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

@Entity
@Data
@Table(name = "DepartmentAndEmployee11")
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	@Id
	Integer id;
	@Column(length = 20)
	String deptName;
	@ElementCollection
	@CollectionTable(name = "EmployeeDept11", joinColumns = @JoinColumn(name = "id"))
	List<Employee> employees;
}
