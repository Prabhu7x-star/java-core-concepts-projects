package com.student;

public abstract class Person {
	int id;
	String name;
	abstract void displayDetails();
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
