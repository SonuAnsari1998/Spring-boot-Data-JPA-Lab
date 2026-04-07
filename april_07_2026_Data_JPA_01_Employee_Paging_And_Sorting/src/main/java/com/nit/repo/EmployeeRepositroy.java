package com.nit.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.nit.entity.Employee;

@Component
public class EmployeeRepositroy implements IEmployeeRepo {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Page<Employee> findAll1() {
		Pageable of = PageRequest.of(0, 5);
		return employeeRepository.findAll(of);

	}

	@Override
	public Iterable<Employee> findAll2() {
		PageRequest of = PageRequest.of(0, 10);
		Sort by = Sort.by(Direction.DESC, "name");
		return employeeRepository.findAll(by);
	}

}
