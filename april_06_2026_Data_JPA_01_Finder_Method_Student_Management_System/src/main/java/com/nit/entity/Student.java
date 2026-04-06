package com.nit.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "StudentFinderMethod")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Student {
	@Id
	private int id;
	@Column(length = 20)
	private String name;
	@Column(length = 20)
	private String course;
	private double marks;
	@Column(length = 20)
	private String grade;
	@Column(length = 20)
	private String city;
	private boolean passed;
}















