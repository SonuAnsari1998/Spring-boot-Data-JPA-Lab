package com.nit.service;

import java.util.List;

import com.nit.entity.Department;

public interface IDepartmentService {
	Department addDepartment(Department dept);
	
	List<Department> showEmployeeDetails();
}
