package com.library;

public class Demo {
	public static void main(String[] args) {
		LibraryOperationsImpl library =
                new LibraryOperationsImpl();

        library.addBook(
                new Book(101,
                        "Effective Java",
                        "Joshua Bloch",
                        599,
                        false));

        library.addBook(
                new Book(102,
                        "Clean Code",
                        "Robert Martin",
                        799,
                        false));
        try {

            library.issueBook(101);

            library.issueBook(999);

        } catch (BookNotFoundException e) {

            System.out.println(e.getMessage());
        }

        library.displayBooks();
	}
}
