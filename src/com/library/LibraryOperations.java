package com.library;

interface LibraryOperations {
	void issueBook(int id) throws BookNotFoundException;
	void returnBook(int id) throws BookNotFoundException;
}
