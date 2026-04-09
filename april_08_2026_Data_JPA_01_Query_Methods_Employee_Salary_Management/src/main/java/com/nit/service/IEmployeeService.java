package com.nit.service;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nit.entity.Employee;

import jakarta.transaction.Transactional;

public interface IEmployeeService {
	List<Employee> findbyDepartment(String dept);

	List<Employee> findbySalaryBetween(double start, double end);

	List<Employee> findbyExperienceGreaterThan(int years);

	long countEmployeesInDepartment(String dept);

	double findbyHighestSalary();

	String updateEmployeeDetails(@Param("name") String name, @Param("department") String department,
			@Param("salary") double salary, @Param("exp") int experience, @Param("id") long id);

	String deleteEmployeeDetails(long id);

	String increaseSalary(@Param("id") Long id, @Param("percentage") double percentage);

	int deleteEmployeesWithLowSalary(@Param("salary") double salary);

}
