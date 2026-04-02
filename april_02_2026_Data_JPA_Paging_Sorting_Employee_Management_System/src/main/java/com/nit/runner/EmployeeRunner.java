package com.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nit.entity.Employee;
import com.nit.service.EmployeeService;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	EmployeeService employeeService;

	@Override
	public void run(String... args) throws Exception {

		IO.println("1. Add Employee");
		IO.println("2. Show Employee Details");
		int ch = Integer.parseInt(IO.readln("Enter your choice"));
		switch (ch) {
		case 1 -> {
			int empId = Integer.parseInt(IO.readln("Enter Employee id"));
			String empName = IO.readln("Enter Employee name");
			String department = IO.readln("Enter Department");
			double salary = Double.parseDouble(IO.readln("Enter Employee Salary"));
			Employee emp = new Employee(empId, empName, department, salary);
			employeeService.saveEmployees(emp);
		}
		case 2 -> {
			int pageNo = Integer.parseInt(IO.readln("Enter Page No."));
			int pageSize = Integer.parseInt(IO.readln("Enter Page size"));
			String sortBy = IO.readln("Enter Short by(empId,empName,department,salary)");
			String order = IO.readln("Enter order");
			Page<Employee> employeesByPageAndSort = employeeService.getEmployeesByPageAndSort(pageNo, pageSize, sortBy, order);
			
			for(Employee emp:employeesByPageAndSort) {
				IO.println(emp);
			}
		}
		default -> System.out.println("Invalid choice");
		}

	}

}
