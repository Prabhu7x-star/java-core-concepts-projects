package com.student;

public class Student extends Person{
	int marks;
	public Student(int id, String name,int marks) throws InvalidMarksException{
		super(id, name);
		if(marks<0 || marks>100) {
			throw new InvalidMarksException("Mark Should be 0 to 100");
		}
		this.marks=marks;
	}
	@Override
	void displayDetails() {
		System.out.println("ID: "+id+"\n"+"Name: "+name+"\n"+"Marks: "+marks);
		
	}
	public int getMarks() {
		return marks;
	}
	
	
	
}
