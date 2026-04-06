package com.nit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Doctor;
import com.nit.service.DoctorService;

@Component
public class DoctorRunner implements CommandLineRunner {
	@Autowired
	DoctorService doctorService;

	@Override
	public void run(String... args) throws Exception {
		IO.println("1. Add Doctor");
		IO.println("2. Seach Doctor Names by fee");
		int choice = Integer.parseInt(IO.readln("Enter Your Choice!!!"));
		switch (choice) {
		case 1 -> {
			int id = Integer.parseInt(IO.readln("Enter Doctor id"));
			String name = IO.readln("Enter Doctor Name");
			String add = IO.readln("Enter Doctor Address");
			double fee = Double.parseDouble(IO.readln("Enter Doctor Fee"));
			Doctor doctor = new Doctor(id, name, add, fee);
			String msg = doctorService.addDoctor(doctor);
			IO.println("Doctor Added Sucessfully");
		}
		case 2 -> {
			double startFee = Double.parseDouble(IO.readln("Enter Doctor Start Fee"));
			double endFee = Double.parseDouble(IO.readln("Enter Doctor End Fee"));
			List<String> searchAllDoctorsNameByFee = doctorService.searchAllDoctorsNameByFee(startFee, endFee);
			searchAllDoctorsNameByFee.forEach(IO::println);
		}
		default -> System.err.println("Invalid choice");
		}
	}

}
