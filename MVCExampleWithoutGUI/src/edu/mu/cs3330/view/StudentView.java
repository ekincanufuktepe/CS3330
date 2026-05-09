package edu.mu.cs3330.view;

public class StudentView {
	
	public void printStudentDetails(String name, Integer id, String gradeLetter) {
		System.out.println("===== STUDENT DETAILS =====");
		System.out.println("Name:  " + name);
		System.out.println("ID:    " + id.intValue());
		System.out.println("Grade: " + gradeLetter);
	}

}
