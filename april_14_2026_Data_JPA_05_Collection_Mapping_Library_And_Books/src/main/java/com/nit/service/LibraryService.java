package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Library;
import com.nit.repo.LibraryRepository;

import jakarta.transaction.Transactional;

@Service
public class LibraryService implements ILibraryService{
	@Autowired
	LibraryRepository libraryRepository;
	
	@Override
	public Library createLibrary(Library library) {
		return libraryRepository.save(library);
	}

	@Override
	public List<Library> fetchLibrary() {
		return libraryRepository.findAll();
	}
	
}
