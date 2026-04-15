package com.nit.service;

import java.util.List;

import com.nit.entity.Employee;

public interface IEmployeeService {
	String addEmployee(Employee employee);
	
	List<Employee> viewAll();

	List<Employee> findByEmployeeDepartment(String dept);
	
	List<Employee> findByEmployeeGraterThan(double salary);
	
	List<Employee> findBykeyword(String key);
	
	Long countEmployeeInDepartment(String dept);
	
	List<Employee> findByDesignation(String des, String  dept);
	
	List<Employee> findBySalaryRange(double min, double max);
	
	List<Employee> top5Employee();
	
	long countEmployee();
	
	Double getAvgSalary();
	
	Long DepartmentWiseEmployeeCount(String dept);
	
	int updateSalary(double salary, Long id);
}
