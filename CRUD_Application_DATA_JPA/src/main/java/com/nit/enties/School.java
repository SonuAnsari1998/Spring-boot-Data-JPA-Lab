package com.nit.enties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {
	
	@Id
	private int student_id;
	@Column(length = 20)
	private String student_name;
	@Column(length = 20)
	private String student_Address;
	private long student_contact;
	@Column(length = 20)
	private String student_email;

}

