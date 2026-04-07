package com.nit.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nit.entity.Employee;
@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	EmployeeRepositroy employeeRepositroy;

	@Override
	public void run(String... args) throws Exception {

		IO.println("1. find All (Pageabel)");
		IO.println("2. find All (Sort)");
		int choice = Integer.parseInt(IO.readln("Enter your choice"));

		switch (choice) {
		case 1 -> {
			Page<Employee> all1 = employeeRepositroy.findAll1();
			all1.forEach(IO::println);
		}
		case 2 -> {
			Iterable<Employee> all2 = employeeRepositroy.findAll2();
			all2.forEach(IO::println);

		}
		default -> System.err.println("Invalid choice");
		}

	}

}
