package com.nit.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "UserProfileManagementSystem")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long uId;
	@NonNull
	@Column(length = 20)
	String name;
	@NonNull
	@Column(length = 20)
	String email; 

	@NonNull
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Profile_Id")
	Profile profile;
}
