package com.sicemal.example.demo1;

import java.util.Collections;
import java.util.List;


public class BookService {
	
	public List<Book> getBooksInSort() {
		List<Book> books = new BookDAO().getBooks();
		// Lambda expression comparator for sort list - Get sorted list of books
		Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName())); 
		return books;
	}
	
	public static void main(String[] args) {
		System.out.println("Books Sorted: " + new BookService().getBooksInSort());
	}

}


