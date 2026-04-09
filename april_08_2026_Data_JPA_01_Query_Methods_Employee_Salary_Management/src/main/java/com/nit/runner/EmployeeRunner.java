package com.nit.runner;

import java.nio.channels.InterruptedByTimeoutException;
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
		System.out.println("==================================\n" + "        "
				+ "Employee Management       \n"
				+ "==================================\n" + ""
				+ "1. Find employees by Department\n"
				+ "2. Find employees by Salary Range\n" + ""
				+ "3. Find employees by Experience\n"
				+ "4. Count employees in a Department\n" + ""
				+ "5. Find Highest Salary\n" + ""
				+ "6. Update Employee Details\n"
				+ "7. Delete Employee by ID\n" + ""
				+ "8. Increase Salary by Percentage\n"
				+ "9. Delete Employees with Salary less than a value\n" + ""
				+ "0. Exit\n"
				+ "==================================\n" + "Enter your choice: ");

		int choice = Integer.parseInt(IO.readln());
		switch (choice) {
		case 1 -> {
			String dept = IO.readln("Enter Department want to find");
			List<Employee> findbyDepartment = employeeService.findbyDepartment(dept);
			findbyDepartment.forEach(IO::println);
		}
		case 2 -> {
			double start = Double.parseDouble(IO.readln("Enter Starting Salary"));
			double end = Double.parseDouble(IO.readln("Enter ending Salary"));
			List<Employee> findbySalaryBetween = employeeService.findbySalaryBetween(start, end);
			findbySalaryBetween.forEach(IO::println);
		}
		case 3 -> {
			int year = Integer.parseInt(IO.readln("Enter Year of Experience"));
			List<Employee> findbyExperienceGreaterThan = employeeService.findbyExperienceGreaterThan(year);
			findbyExperienceGreaterThan.forEach(IO::println);
		}
		case 4 -> {
			String dept = IO.readln("Enter Department want to count");
			long countEmployeesInDepartment = employeeService.countEmployeesInDepartment(dept);
			System.out
					.println("Total no. of Employee in this Departmetn " + dept + " is " + countEmployeesInDepartment);
		}
		case 5 -> {
			double findbyHighestSalary = employeeService.findbyHighestSalary();
			System.out.println("Highest Salary in Company " + findbyHighestSalary);
		}
		case 6 -> {

			int id = Integer.parseInt(IO.readln("Enter Employee id want to update"));
			String name = IO.readln("Enter Employee Name");
			String dept = IO.readln("Enter Department");
			double salary = Double.parseDouble(IO.readln("Enter Salary"));
			int exp = Integer.parseInt(IO.readln("Enter Experience"));
			String updateEmployeeDetails = employeeService.updateEmployeeDetails(name,dept,salary, exp,id);
			System.out.println(updateEmployeeDetails);
		}
		case 7 -> {
			Long id = Long.parseLong(IO.readln("Enter Employee id want to delete"));
			String deleteEmployeeDetails = employeeService.deleteEmployeeDetails(id);
			System.out.println(deleteEmployeeDetails);
		}
		case 8 -> {
			Long id = Long.parseLong(IO.readln("Enter Employee id want to increse salary"));
			double per = Double.parseDouble(IO.readln("Enter percentage"));
			String increaseSalary = employeeService.increaseSalary(id, per);
			System.out.println(increaseSalary);
		}
		case 9 -> {
			
		}
		case 0 -> {
			IO.println("Thank You!!!");
			System.exit(0);
		}
		default -> System.err.println("Invalid choice..");
		}

	}

}