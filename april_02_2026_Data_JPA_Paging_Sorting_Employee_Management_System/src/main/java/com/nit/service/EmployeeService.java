package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nit.entity.Employee;
import com.nit.repo.EmployeeRepository;

@Service
public class EmployeeService{
	@Autowired
	EmployeeRepository employeeRepository;

	public void saveEmployees(Employee emp) {
		employeeRepository.save(emp);
		System.out.println("Employee added Sucessfully!!!");
	}

	public Page<Employee> getEmployeesByPageAndSort(int pageNo, int pageSize, String sortBy, String order) {
	Direction d=(order.equals("desc"))?Sort.Direction.DESC:Sort.Direction.ASC; 
	Sort sort = Sort.by(d, sortBy);
		Pageable of = PageRequest.of(pageNo, pageSize, sort);
		Page<Employee> all = employeeRepository.findAll(of);
		return all;
	}

}
