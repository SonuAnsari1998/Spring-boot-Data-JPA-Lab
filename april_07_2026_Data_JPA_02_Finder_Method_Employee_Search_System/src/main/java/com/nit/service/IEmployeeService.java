package com.nit.service;

import java.time.LocalDate;
import java.util.List;

import com.nit.entity.Employee;

public interface IEmployeeService {
	
	List<Employee> findByDepartment(String department);

	List<Employee> findBySalaryGreaterThan(double salary);

	List<Employee> findByJoiningDateAfter(LocalDate joiningDate);

	List<Employee> findByNameContainingIgnoreCase(String keyword);
}
