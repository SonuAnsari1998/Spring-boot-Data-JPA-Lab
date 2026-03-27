package com.nit.controller;

import org.springframework.data.repository.CrudRepository;

import com.nit.enties.School;

public interface StudentRepo extends CrudRepository<School, Integer>{
	
}
