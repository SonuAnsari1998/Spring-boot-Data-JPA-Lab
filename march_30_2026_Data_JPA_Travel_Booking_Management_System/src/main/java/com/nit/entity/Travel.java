package com.nit.entity;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Travel {
	@Id
	private long id;
	@Column(length = 20)
	private String destination;
	@Column(length = 20)
	private String transportationMode;
	private double price;
}
