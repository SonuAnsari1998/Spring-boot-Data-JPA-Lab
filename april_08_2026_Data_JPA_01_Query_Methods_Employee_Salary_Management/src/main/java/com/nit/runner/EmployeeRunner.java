package com.nit.runner;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Employee;
import com.nit.service.EmployeeService;

@Component
public class EmployeeRunner implements CommandLineRunner{
	@Autowired
	EmployeeService employeeService;
	
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(
			    "==================================\n" +
			    "        Employee Management       \n" +
			    "==================================\n" +
			    "1. Find employees by Department\n" +
			    "2. Find employees by Salary Range\n" +
			    "3. Find employees by Experience\n" +
			    "4. Count employees in a Department\n" +
			    "5. Find Highest Salary\n" +
			    "6. Update Employee Details\n" +
			    "7. Delete Employee by ID\n" +
			    "8. Increase Salary by Percentage\n" +
			    "9. Delete Employees with Salary less than a value\n" +
			    "0. Exit\n" +
			    "==================================\n" +
			    "Enter your choice: "
			);
		
		int choice=Integer.parseInt(IO.readln());
		switch(choice) {
		case 1->{
			String dept =IO.readln("Enter Department want to find");
			List<Employee> findbyDepartment = employeeService.findbyDepartment(dept);
			findbyDepartment.forEach(IO::println);
		}
		case 2->{
			
		}
		case 3->{
			
		}
		case 4->{
			
		}
		case 5->{
			
		}
		case 6->{
			
		}
		case 7->{
			
		}
		case 8->{
			
		}
		case 9->{
			
		}
		case 0->{
			
		}
		default -> System.err.println("Invalid choice..");
		}
		
	}

}
