package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long pId;
	@NonNull
	@Column(length = 20)
	String phone;
	@NonNull
	@Column(length = 20)
	String address;
}
