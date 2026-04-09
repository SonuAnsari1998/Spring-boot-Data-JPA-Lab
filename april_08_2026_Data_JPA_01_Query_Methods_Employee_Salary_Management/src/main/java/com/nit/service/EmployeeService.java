package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.entity.Employee;
import com.nit.repo.IEmployee;
@Component
public class EmployeeService implements IEmployeeService{
	@Autowired
	IEmployee employee;

	@Override
	public List<Employee> findbyDepartment(String dept) {
		return employee.findbyDepartment(dept);
	}

	@Override
	public List<Employee> findbySalaryBetween(double start, double end) {
		return employee.findbySalaryBetween(start, end);
	}

	@Override
	public List<Employee> findbyExperienceGreaterThan(int years) {
		return employee.findbyExperienceGreaterThan(years);
	}

	@Override
	public long countEmployeesInDepartment(String dept) {
		return employee.countEmployeesInDepartment(dept);
	}

	@Override
	public double findbyHighestSalary() {
		return employee.findbyHighestSalary();
	}

	@Override
	public String updateEmployeeDetails(String name, String department, double salary, int experience, long id) {
		 employee.updateEmployeeDetails(name, department, salary, experience, id);
		 return "Updated sucessfully";
	}

	@Override
	public String deleteEmployeeDetails(long id) {
		employee.deleteEmployeeDetails(id);
		return "Deleted sucessfully";
	}

	@Override
	public String increaseSalary(Long id, double percentage) {
		employee.increaseSalary(id, percentage);
		return "Id "+id+" incresed with "+percentage+"%";
	}

	@Override
	public String deleteEmployeesWithLowSalary(double salary) {
		employee.deleteEmployeesWithLowSalary(salary);
		return "Lowest Salary Deleted Sucess";
	}
}
