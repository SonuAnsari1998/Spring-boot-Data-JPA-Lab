package com.nit.service;

import java.util.List;

import com.nit.entity.Doctor;

public interface IDoctorService {
	public String addDoctor(Doctor doctor);

	public List<String> searchAllDoctorsNameByFee(double start, double end);
}
