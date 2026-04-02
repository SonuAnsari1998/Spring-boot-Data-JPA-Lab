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
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "StudentRankingSystem")
public class Student {
	@Id
	private int studentId;
	@Column(length = 20)
	private String studentName;
	@Column(length = 20)
	private String course;
	private double marks;
}
