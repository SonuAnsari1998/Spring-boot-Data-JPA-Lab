package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.entity.Doctor;
import com.nit.repo.DoctorRepo;

@Component
public class DoctorService implements IDoctorService {
	@Autowired
	DoctorRepo doctorRepo;

	@Override
	public String addDoctor(Doctor doctor) {
		doctorRepo.save(doctor);
		return "Doctor Added Sucessfully";
	}

	@Override
	public List<String> searchAllDoctorsNameByFee(double start, double end) {
		return doctorRepo.searchAllDoctorsNameByFee(start, end);
	}

}
