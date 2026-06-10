package com.student;

import java.util.ArrayList;

public class StudentService {
	ArrayList<Student> studentlist=new ArrayList<Student>();
	public void addStudent(Student s) {
		studentlist.add(s);
		System.out.println("Sttudent added successfully with id "+s.id);
	}
	public void sortStudentsByMarks() {
		studentlist.sort((s1,s2)->Integer.compare(s2.getMarks(), s1.getMarks()));

	}
	public void findTopper() {
//			Student topper=studentlist.get(0);
//			for(Student s:studentlist) {
//				if(s.getMarks()>topper.getMarks()) {
//					topper=s;
//				}
//			}
//			topper.displayDetails();
		
		Student topper=studentlist.stream().max((s1,s2) ->
        Integer.compare(
                s1.getMarks(),
                s2.getMarks()
            )).orElse(null);
		if(topper != null)
		{
		    System.out.print("Topper Details");
		    topper.displayDetails();
		}
	}
	public void dispalyStudents() {
		for(Student s:studentlist) {
			s.displayDetails();
			System.out.println();
		}
	}
}
