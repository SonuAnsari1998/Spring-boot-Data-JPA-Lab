package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Department;
import com.nit.repo.IDepartmentRepository;
import jakarta.transaction.Transactional;

@Transactional
@Service
public class DepartmentService implements IDepartmentService{
	@Autowired
	IDepartmentRepository departmentRepository;
	
	@Override
	public Department addDepartment(Department dept) {
		return departmentRepository.save(dept);
	}

	@Override
	public List<Department> showEmployeeDetails() {
		return departmentRepository.findAll();
	}
}
