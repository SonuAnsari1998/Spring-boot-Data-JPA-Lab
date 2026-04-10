package com.nit.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Entity
@Table(name = "StudentCourseEnrollmentSystem")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	private Long id;
	@Column(length = 20)
	private String name;
	@Column(length = 20)
	private String course;
	private double fee;
	@Column(length = 20)
	private String grade;
	
	
	
}
