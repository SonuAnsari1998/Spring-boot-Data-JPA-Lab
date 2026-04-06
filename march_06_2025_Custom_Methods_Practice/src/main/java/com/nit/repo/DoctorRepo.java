package com.nit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nit.entity.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer>, CrudRepository<Doctor, Integer> {
//	@Query("insert")
	public String addDoctor(Doctor doctor);
	
	@Query("select name from Doctor where fee between :max and :min")
	public List<String> searchAllDoctorsNameByFee(double max, double min);
}
