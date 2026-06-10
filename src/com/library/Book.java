package com.library;

public class Book {
	int id;
	String title;
	String author;
	double price;
	boolean issued;
	public Book(int id, String title, String author, double price, boolean issued) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.issued = issued;
	}
	public void setIssued(boolean issued) {
		this.issued = issued;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", issued=" + issued
				+ "]";
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public boolean isIssued() {
		return issued;
	}
	
}
