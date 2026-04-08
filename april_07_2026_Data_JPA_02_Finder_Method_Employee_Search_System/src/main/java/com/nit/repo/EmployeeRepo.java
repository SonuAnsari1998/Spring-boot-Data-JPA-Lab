package com.nit.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	List<Employee> findByDepartment(String department);

	List<Employee> findBySalaryGreaterThan(double salary);


	List<Employee> findByJoiningDateAfter(LocalDate joiningDate);

	List<Employee> findByNameContainingIgnoreCase(String keyword);
}
