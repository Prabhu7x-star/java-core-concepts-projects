package com.library;

import java.util.HashMap;

public class LibraryOperationsImpl implements LibraryOperations{

	HashMap<Integer,Book> hm=new HashMap<Integer, Book>();
	@Override
	public void issueBook(int id) throws BookNotFoundException {
		Book book=hm.get(id);
		if(book==null) 
			throw new BookNotFoundException("Book with ID "+id+" not found");
		if(book.isIssued()) {
			System.out.println("Book Already issued");
			return;
		}
		book.setIssued(true);
		System.out.println("Book issued successfully");
	}
			

	@Override
	public void returnBook(int id) throws BookNotFoundException {
		Book book=hm.get(id);
		if(book==null)
			throw new BookNotFoundException("Book with ID "+id+" not found");
		if(!book.isIssued()) {
			System.out.println("book already available");
			return;
		}
		book.setIssued(false);
		System.out.println("Book returned successfully");
	
	}
	public void addBook(Book b) {
		hm.put(b.getId(),b);
		System.out.println("Book added Successfully :"+b.getTitle());
	}
	public void displayBooks() {
		for(Book b:hm.values()) {
			System.out.println(b);
		}
	}

}
