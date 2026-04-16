package com.nit.service;

import java.util.List;

import com.nit.entity.Employee;

public interface IEmployeeService {
	Employee createEmployee(Employee employee);

	List<Employee> fetchAllEmployee();
}
