package com.sicemal.example.demo1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	
	public List<Book> getBooksInSort() {
		List<Book> books = new BookDAO().getBooks();
		// Anonymous implementation Comparator - Get sorted list of books
		Collections.sort(books, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		return books;
	}
	
	public static void main(String[] args) {
		System.out.println("Books Sorted: " + new BookService().getBooksInSort());
	}

}


