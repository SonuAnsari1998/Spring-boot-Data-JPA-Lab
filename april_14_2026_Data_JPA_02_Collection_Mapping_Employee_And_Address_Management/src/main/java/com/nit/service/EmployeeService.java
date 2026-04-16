package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Employee;
import com.nit.repo.EmployeeRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> fetchAllEmployee() {
		return employeeRepository.findAll();
	}

}
