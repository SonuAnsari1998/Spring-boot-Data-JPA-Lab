package com.nit.service;

import java.util.List;

import com.nit.entity.Library;

public interface ILibraryService {
	Library createLibrary(Library library);

	List<Library> fetchLibrary();
}
