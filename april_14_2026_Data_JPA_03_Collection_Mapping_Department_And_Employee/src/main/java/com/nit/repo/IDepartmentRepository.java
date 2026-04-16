package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

}
