package com.nit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nit.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>, CrudRepository<Employee, Long>{
	//JPQL (@Query)
	//-------------
	//Find employees by department
	@Query("from Employee e where e.department = :dept")
	List<Employee> findByEmployeeDepartment(String dept);
	

	//Find employees with salary greater than given value
	@Query("from Employee e where e.salary>= :salary")
	List<Employee> findByEmployeeGraterThan(double salary);
	
	
	//Search employees by name keyword
	@Query("SELECT e FROM Employee e WHERE e.name LIKE %:key%")
	List<Employee> findBykeyword(String key);
	
	
	//Count employees in a department
	@Query("select count(e) from Employee e where department= :dept")
	Long countEmployeeInDepartment(String dept);
	
	
	
	//Find employees by designation AND department
	@Query("from Employee e where designation = :des And department = :dept")
	List<Employee> findByDesignation(String des, String  dept);
	
    
	//Native Query
	//------------
	//Find employees with salary between range
	@Query(value = "SELECT * FROM employee_analytics_system WHERE salary BETWEEN ?1 AND ?2", nativeQuery = true)
	List<Employee> findBySalaryRange(double min, double max);
	
	
	
	
	//Fetch top 5 highest paid employees
	@Query(value ="SELECT * FROM employee_analytics_system ORDER BY salary DESC FETCH FIRST 5 ROWS ONLY", nativeQuery = true)
	List<Employee> top5Employee();
	
	//Count total employees
	@Query(value = "select count(*) from employee_analytics_system ", nativeQuery = true)
	long countEmployee();
	
	
	//Get average salary
	@Query(value = "select avg(salary) from employee_analytics_system", nativeQuery = true)
	Double getAvgSalary();
	
	
	//Department-wise employee count
	@Query(value = "select count(*) from employee_analytics_system where DEPARTMENT= ?1", nativeQuery = true)
	Long DepartmentWiseEmployeeCount(String dept);
    
	//Update 
	@Modifying
	@Query(value = "UPDATE employee_analytics_system SET salary = ?1 WHERE id = ?2", nativeQuery = true)
	int updateSalary(double salary, Long id);
	
	
	//Update employee salary by id (@Query)
	//Increase salary by 5000 for a department (Native)
	//Delete employees by department (Native)
}
