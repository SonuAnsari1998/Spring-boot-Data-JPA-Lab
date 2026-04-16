package com.nit.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Book;
import com.nit.entity.Library;
import com.nit.service.LibraryService;

import jakarta.transaction.Transactional;
@Component
@Transactional
public class LibraryRunner implements CommandLineRunner {
	@Autowired
	LibraryService lib;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Library & Books");
		System.out.println("1. Add Library and books ");
		System.out.println("2. Fetch Library and books ");
		int choice = Integer.parseInt(IO.readln("Enter Your choice"));
		switch (choice) {
		case 1 -> {
			int id = Integer.parseInt(IO.readln("Enter Library id"));
			String name = IO.readln("Enter Library Name");
			List<Book> books = new ArrayList();
			int noOfBooks = Integer.parseInt(IO.readln("Enter no. books want to add"));
			for (int i = 1; i <= noOfBooks; i++) {
				System.out.println("Book No. " + i);
				Integer bookId = Integer.parseInt(IO.readln("Enter book id"));
				String bookTitle = IO.readln("Enter book title");
				Book book = new Book(bookId, bookTitle);
				books.add(book);
			}
			Library library = new Library(id, name, books);
			lib.createLibrary(library);
			System.out.println("Added Sucessfully");
		}
		case 2 -> {
			lib.fetchLibrary().forEach(IO::println);
		}

		default -> System.err.println("Invalid choice");

		}
	}

}
