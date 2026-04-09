package com.nit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nit.entity.Employee;

import jakarta.transaction.Transactional;

public interface IEmployee extends JpaRepository<Employee, Long> {

	// Find employees by department
	@Query("from Employee where department = :dept")
	List<Employee> findbyDepartment(@Param("dept") String dept);

	// Find employees with salary between two values
	@Query("from Employee where salary >= :start and salary <= :end")
	List<Employee> findbySalaryBetween(@Param("start") double start,
									   @Param("end") double end);

	// Find employees with experience greater than given years
	@Query("from Employee where experience >= :years")
	List<Employee> findbyExperienceGreaterThan(@Param("years") int years);

	// Count employees in a department
	@Query("select count(e) from Employee e where e.department = :dept")
	long countEmployeesInDepartment(@Param("dept") String dept);

	// Get highest salary
	@Query("SELECT MAX(e.salary) FROM Employee e")
	double findbyHighestSalary();

	// Update
	@Modifying
	@Transactional
	@Query("update Employee e set e.name = :name, e.department = :department, e.salary = :salary, e.experience = :experience where e.id = :id")
	int updateEmployeeDetails(@Param("name") String name,
							 @Param("department") String department,
							 @Param("salary") double salary,
							 @Param("experience") int experience,
							 @Param("id") long id);

	// Delete by id
	@Modifying
	@Transactional
	@Query("delete from Employee e where e.id = :id")
	int deleteEmployeeDetails(@Param("id") long id);

	// Increase salary
	@Modifying
	@Transactional
	@Query("UPDATE Employee e SET e.salary = e.salary + (e.salary * :percentage / 100) WHERE e.id = :id")
	int increaseSalary(@Param("id") Long id,
					   @Param("percentage") double percentage);

	// Delete employees with low salary
	@Modifying
	@Transactional
	@Query("DELETE FROM Employee e WHERE e.salary < :salary")
	String deleteEmployeesWithLowSalary(@Param("salary") double salary);
}