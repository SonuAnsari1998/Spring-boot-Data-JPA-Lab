package com.nit.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Address;
import com.nit.entity.Employee;
import com.nit.service.EmployeeService;

import jakarta.transaction.Transactional;

@Component
@Transactional
public class EmployeeRunner implements CommandLineRunner {

    @Autowired
    EmployeeService employeeService;

    @Override
    public void run(String... args) throws Exception {
        IO.println("Employee & Address Management");
        IO.println("1. Add Employee");
        IO.println("2. Fetch Employee");

        int choice = Integer.parseInt(IO.readln("Enter Your Choice"));

        switch (choice) {
            case 1 -> {
                int id = Integer.parseInt(IO.readln("Enter Employee id"));
                String name = IO.readln("Enter Employee Name");

                List<Address> listOfAddress = new ArrayList<>();
                int noOfAddress = Integer.parseInt(IO.readln("Enter how many address want to save"));

                for (int i = 1; i <= noOfAddress; i++) {
                    IO.println("Address No: " + i);
                    String city = IO.readln("Enter city");
                    String state = IO.readln("Enter state");
                    listOfAddress.add(new Address(city, state));
                }

                Employee emp = new Employee(id, name, listOfAddress);
                employeeService.createEmployee(emp);

                System.out.println("Added Successfully");
            }

            case 2 -> {
                List<Employee> employees = employeeService.fetchAllEmployee();
                employees.forEach(emp -> {
                    System.out.println(emp);
                    emp.getAddresses().forEach(addr -> System.out.println("   " + addr));
                });
            }

            default -> System.out.println("Invalid choice");
        }
    }
}