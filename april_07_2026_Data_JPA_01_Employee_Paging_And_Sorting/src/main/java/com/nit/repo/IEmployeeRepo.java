package com.nit.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.nit.entity.Employee;

public interface IEmployeeRepo {

	Page<Employee> findAll1();

	Iterable<Employee> findAll2();

}
