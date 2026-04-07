package com.nit.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nit.entity.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
	Page<Employee> findAll(Pageable pageable);

	Iterable<Employee> findAll(Sort sort);
}
