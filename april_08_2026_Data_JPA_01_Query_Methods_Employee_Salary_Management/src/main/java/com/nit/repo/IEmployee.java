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
	@Query("from Employee where department=:dept")
	List<Employee> findbyDepartment(String dept);

	// Find employees with salary between two values
	@Query("from Employee where salary>=:start and <=:end")
	List<Employee> findbySalaryBetween(double start, double end);

	// Find employees with experience greater than given years
	@Query("from Employee where experience >= :years")
	List<Employee> findbyExperienceGreaterThan(int years);

	// Count employees in a department
	@Query("select count(e) from Employee e where e.department = :dept")
	long countEmployeesInDepartment(String dept);

	// Get highest salary employee
	@Query("SELECT MAX(e.salary) FROM Employee e")
	double findbyHighestSalary();

	// Update
	@Query("update Employee e set e.name = :name, e.department = :department, e.salary = :salary, e.experience = :experience where id=:id")
	String updateEmployeeDetails(@Param("name") String name, @Param("department") String department,
			@Param("salary") double salary, @Param("exp") int experience, @Param("id") long id);

	// Delete
	@Query("delete from Employee where id=:id")
	String deleteEmployeeDetails(long id);

	// Increase salary by percentage using id (@Modifying)
	@Modifying
	@Transactional
	@Query("UPDATE Employee e SET e.salary = e.salary + (e.salary * :percentage / 100) WHERE e.id = :id")
	String increaseSalary(@Param("id") Long id, @Param("percentage") double percentage);

	// Delete employees with salary less than given value (@Modifying)
	@Modifying
	@Transactional
	@Query("DELETE FROM Employee e WHERE e.salary < :salary")
	int deleteEmployeesWithLowSalary(@Param("salary") double salary);
}
