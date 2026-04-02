package com.nit.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nit.entity.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> , CrudRepository<Employee, Integer>{

}
