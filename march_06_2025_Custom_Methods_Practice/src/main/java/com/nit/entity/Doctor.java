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
@Table(name = "Doctor_List")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Doctor {
	@Id
	@Column(name = "Doctor_Id")
	private int id;
	@Column(length = 20, name = "Doctor_Name")
	private String name;
	@Column(length = 20, name = "Doctor_Address")
	private String add;
	@Column(name = "Doctor_Fee")
	private double fee;
}
