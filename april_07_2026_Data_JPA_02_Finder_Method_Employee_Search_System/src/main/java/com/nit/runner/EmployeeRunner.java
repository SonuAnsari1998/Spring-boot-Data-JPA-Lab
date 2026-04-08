package com.nit.runner;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Employee;
import com.nit.service.EmployeeService;

@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	EmployeeService employeeService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n===== Employee Search System =====");
		System.out.println("1. Find by Department");
		System.out.println("2. Find by Salary Greater Than");
		System.out.println("3. Find by Joining Date After");
		System.out.println("4. Find by Name (Ignore Case)");
		System.out.println("5. Exit");
		int choice = Integer.parseInt(IO.readln("Enter your choice: "));

		switch (choice) {
		case 1 -> {
			String department = IO.readln("Enter Department want to find");
			List<Employee> byDepartment = employeeService.findByDepartment(department);
			byDepartment.forEach(IO::println);
		}
		case 2 -> {
			double salary = Double.parseDouble(IO.readln("Enter Salary"));
			List<Employee> bySalaryGreaterThan = employeeService.findBySalaryGreaterThan(salary);
			bySalaryGreaterThan.forEach(IO::println);
		}
		case 3 -> {
			LocalDate joiningDate = LocalDate.parse(IO.readln("Enter joining Date"));
			List<Employee> byJoiningDateAfter = employeeService.findByJoiningDateAfter(joiningDate);
			byJoiningDateAfter.forEach(IO::println);
		}
		case 4 -> {
			String keyword = IO.readln("Enter Keyword");
			List<Employee> byNameContainingIgnoreCase = employeeService.findByNameContainingIgnoreCase(keyword);
			byNameContainingIgnoreCase.forEach(IO::println);
		}
		case 5 -> {
			System.out.println("Thank You!!!");
			System.exit(0);

		}
		default -> System.err.println("Invalid Choice..");
		}
	}

}
