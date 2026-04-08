package com.nit.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.entity.Employee;
import com.nit.repo.EmployeeRepo;
@Component
public class EmployeeService implements IEmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public List<Employee> findByDepartment(String department) {
		return employeeRepo.findByDepartment(department);
	}

	@Override
	public List<Employee> findBySalaryGreaterThan(double salary) {
		return employeeRepo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> findByJoiningDateAfter(LocalDate joiningDate) {
		return employeeRepo.findByJoiningDateAfter(joiningDate);
	}

	@Override
	public List<Employee> findByNameContainingIgnoreCase(String keyword) {
		return employeeRepo.findByNameContainingIgnoreCase(keyword);
	}
}
