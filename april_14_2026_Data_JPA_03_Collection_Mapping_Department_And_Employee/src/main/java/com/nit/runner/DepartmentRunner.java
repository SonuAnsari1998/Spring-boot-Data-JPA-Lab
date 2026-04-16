package com.nit.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Department;
import com.nit.entity.Employee;
import com.nit.service.DepartmentService;

import jakarta.transaction.Transactional;

@Component
@Transactional
public class DepartmentRunner implements CommandLineRunner {
	@Autowired
	DepartmentService departmentService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Department & Employee");
		IO.println("1. Add Employee\r\n" + "2. Fetch All Employee");
		int choice = Integer.parseInt(IO.readln("Enter Your Choice"));
		switch (choice) {
		case 1 -> {
			int id = Integer.parseInt(IO.readln("Enter Department id"));
			String deptName = IO.readln("Enter Department Name");
			List<Employee> listOfEmployee = new ArrayList<Employee>();
			int noOfEmployee = Integer.parseInt(IO.readln("Enter no of Employee want to add"));
			for (int i = 1; i <= noOfEmployee; i++) {
				int emp_id = Integer.parseInt(IO.readln("Enter Employee id"));
				String emp_name = IO.readln("Enter Employee name");
				Employee emp = new Employee(emp_id, emp_name);
				listOfEmployee.add(emp);
			}
			Department dept = new Department(id, deptName, listOfEmployee);

			departmentService.addDepartment(dept);
		}
		case 2 -> {
			departmentService.showEmployeeDetails().forEach(IO::println);
		}
		default -> System.err.println("Invalid choice");
		}
	}

}
