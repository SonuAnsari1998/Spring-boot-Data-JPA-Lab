package com.nit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Employee;
import com.nit.service.EmployeeService;

import jakarta.persistence.Column;
@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	EmployeeService employeeService;

	@Override
	public void run(String... args) throws Exception {
		IO.println("1. Add Employee\r\n"
				+ "2. View All Employees\r\n"
				+ "3. Find by Department (JPQL)\r\n"
				+ "4. Find Above Salary (JPQL)\r\n"
				+ "5. Search by Name (JPQL)\r\n"
				+ "6. Count by Department (JPQL)\r\n"
				+ "7. Find by Designation & Dept\r\n"
				+ "8. Salary Range (Native)\r\n"
				+ "9. Top 5 Highest Paid\r\n"
				+ "10. Total Employees\r\n"
				+ "11. Average Salary\r\n"
				+ "12. Dept-wise Count\r\n"
				+ "13. Update Salary\r\n"
				+ "14. Increment Salary by Dept\r\n"
				+ "15. Delete by Department\r\n"
				+ "16. Exit");
		int choice = Integer.parseInt(IO.readln("Enter Your Choice"));
		switch(choice){
		case 1->{
			Long id = Long.parseLong(IO.readln("Enter Employee id"));
			String name = IO.readln("Enter Employee Name");
			String department = IO.readln("Enter Department");
			double salary = Double.parseDouble(IO.readln("Enter Salary"));
			String designation = IO.readln("Enter Designation");
			Employee emp = new Employee(id,name,department,salary,designation);
			String employee = employeeService.addEmployee(emp);
			IO.println(employee);
			
		}
		case 2->{
			List<Employee> viewAll = employeeService.viewAll();
			viewAll.forEach(IO::println);
		}
		case 3->{
			String department = IO.readln("Enter Department want to find");
			List<Employee> byEmployeeDepartment = employeeService.findByEmployeeDepartment(department);
			byEmployeeDepartment.forEach(IO::println);	
		}
		case 4->{
			double salary = Double.parseDouble(IO.readln("Enter Salary want to find Greter than"));
			List<Employee> byEmployeeGraterThan = employeeService.findByEmployeeGraterThan(salary);
			byEmployeeGraterThan.forEach(IO::println);	
		}
		case 5->{
			String name = IO.readln("Enter Employee key want to find");
			List<Employee> bykeyword = employeeService.findBykeyword(name);
			bykeyword.forEach(IO::println);	
		}
		case 6->{
			String department = IO.readln("Enter Department want to find");
			Long countEmployeeInDepartment = employeeService.countEmployeeInDepartment(department);
			System.out.println("\nTotal Employee in "+department+" Department: "+countEmployeeInDepartment+"\n");
		}
		case 7->{
			String des = IO.readln("Enter Department  want to find");
			String dept = IO.readln("Enter Designation want to find");
			List<Employee> byDesignation = employeeService.findByDesignation(des, dept);
			byDesignation.forEach(IO::println);	
		}
		case 8->{
			double min = Double.parseDouble(IO.readln("Enter Min Range Salary"));
			double max = Double.parseDouble(IO.readln("Enter Max Range Salary"));
			List<Employee> employeeSalaryBetween = employeeService.findBySalaryRange(min, max);
			employeeSalaryBetween.forEach(IO::println);
		}
		case 9->{
			employeeService.top5Employee().forEach(IO::println);
		}
		case 10->{
			long countEmployee = employeeService.countEmployee();
			System.out.println("Total Employee : "+countEmployee);
		}
		case 11->{
			Double avgSalary = employeeService.getAvgSalary();
			System.out.println("Avg Salary: "+avgSalary);
		}
		case 12->{
			String department = IO.readln("Enter Department want to count");
			Long departmentWiseEmployeeCount = employeeService.DepartmentWiseEmployeeCount(department);
			System.out.println("Department "+department+" Total Employee is : "+departmentWiseEmployeeCount);
			
		}
		case 13->{
			Long id = Long.parseLong(IO.readln("Enter Employee id want to update"));
			double salary = Double.parseDouble(IO.readln("Enter new Salary"));
			int updateSalary = employeeService.updateSalary(salary, id);
			if(updateSalary>1) {
				System.out.println("Employee id: "+id+"New Salary "+salary+" Updated Sucessfully");
			}else {
				System.out.println("Employee id "+id+" Not Found");
			}
		}
		case 14->{
			
		}
		case 15->{
			
		}
		case 16->{
			
		}
			
			default -> System.out.println("Invalid choice");
		}
	}

}
