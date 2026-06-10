package com.student;

public class StudentMain {
	public static void main(String[] args) {
		StudentService service=new StudentService();
		try {
			Student s1 = new Student(101, "Prabhu", 90);
	        Student s2 = new Student(102, "Rahul", 75);
	        Student s3 = new Student(103, "Hari", 95);
	        Student s4 = new Student(104, "Ramesh", 82);
	        Student s5 = new Student(105, "Suresh", 68);
	        
	        service.addStudent(s1);
	        service.addStudent(s2);
	        service.addStudent(s3);
	        service.addStudent(s4);
	        service.addStudent(s5);
	        
	        System.out.println("===== All Students =====");
	        service.dispalyStudents();
	        
	        System.out.println("\n===== Sorted Students =====");
	        service.sortStudentsByMarks();
	        service.dispalyStudents();
	        
	        System.out.println("\n===== Topper =====");
	        service.findTopper();
	        
	        Student s6 = new Student(106, "Test", 120);
		} catch (InvalidMarksException e) {
			System.out.println(e.getMessage());
		}
	}
}
