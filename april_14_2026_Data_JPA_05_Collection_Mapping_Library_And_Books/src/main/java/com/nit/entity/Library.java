package com.nit.entity;

import java.util.List;

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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "LibraryBooks45")
public class Library {
	@Id
	private Integer id;
	@Column(length = 20)
	private String name;
	@ElementCollection
	@CollectionTable(name = "Book45", joinColumns = @JoinColumn(name = "id"))
	private List<Book> books;
}
