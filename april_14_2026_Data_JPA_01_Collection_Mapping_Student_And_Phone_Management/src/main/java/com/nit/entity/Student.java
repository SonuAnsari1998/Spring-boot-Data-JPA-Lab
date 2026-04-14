package com.nit.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor 
@Entity
@Table(name = "StudentPhoneSystem")

public class Student {
	@Id
	private Long id;
	@Column(length = 20)
	private String name;
	
	@ElementCollection
	@CollectionTable(name = "Phone_Number", joinColumns = @JoinColumn
	(name="id", referencedColumnName = "id"))
	private List<Long> phoneNumbers;
}
