package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nit.entity.Student;

public interface StudentRepository
		extends PagingAndSortingRepository<Student, Integer>, JpaRepository<Student, Integer> {

}
