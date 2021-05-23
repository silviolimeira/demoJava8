package com.sicemal.example.demo1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	
	public List<Book> getBooksInSort() {
		List<Book> books = new BookDAO().getBooks();
		Collections.sort(books, new MyComparator());
		return books;
	}
	
	public static void main(String[] args) {
		System.out.println("Books Sorted: " + new BookService().getBooksInSort());
	}

}

class MyComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// descending order
		//return o2.getName().compareTo(o1.getName());
		return o1.getName().compareTo(o2.getName());
	}
	
}
