package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Employee;
import com.nit.repo.EmployeeRepo;

import jakarta.transaction.Transactional;
@Transactional
@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public String addEmployee(Employee employee) {
		 employeeRepo.save(employee);
		 return "Employee id: "+employee.getId()+" Added Sucessfully";
	}
	
	@Override
	public List<Employee> viewAll() {
		return employeeRepo.findAll();
	}
	
	@Override
	public List<Employee> findByEmployeeDepartment(String dept) {
		return employeeRepo.findByEmployeeDepartment(dept);
	}

	@Override
	public List<Employee> findByEmployeeGraterThan(double salary) {
		return employeeRepo.findByEmployeeGraterThan(salary);
	}

	@Override
	public List<Employee> findBykeyword(String key) {
		return employeeRepo.findBykeyword(key);
	}

	@Override
	public Long countEmployeeInDepartment(String dept) {
		return employeeRepo.countEmployeeInDepartment(dept);
	}

	@Override
	public List<Employee> findByDesignation(String des, String dept) {
		return employeeRepo.findByDesignation(des, dept);
	}

	@Override
	public List<Employee> findBySalaryRange(double min, double max) {
		return employeeRepo.findBySalaryRange(min, max);
	}

	@Override
	public List<Employee> top5Employee() {
		return employeeRepo.top5Employee();
	}

	@Override
	public long countEmployee() {
		long count = employeeRepo.count();
		return count;
	}

	@Override
	public Double getAvgSalary() {
		return employeeRepo.getAvgSalary();
	}

	@Override
	public Long DepartmentWiseEmployeeCount(String dept) {
		return employeeRepo.DepartmentWiseEmployeeCount(dept);
	}

	@Override
	public int updateSalary(double salary, Long id) {
		return employeeRepo.updateSalary(salary, id);
	}

	





}
