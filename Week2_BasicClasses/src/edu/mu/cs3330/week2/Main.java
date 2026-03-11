package edu.mu.cs3330.week2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		// Bad practice when we have public fields
//		student1.name = "Ekin";
//		System.out.println("Student name: " + student1.name);
//		student1.name = "Robin";
//		System.out.println("Student name: " + student1.name);
		
		// Good practice have private fields
		student1.setName("Ekin");
		System.out.println("Student name: " + student1.getName());
		System.out.println(student1.setId(-2));
		System.out.println("Student id: " + student1.getId());
		
		System.out.println("Student 1's instructor is: " + student1.getInstructor() );
		
		// Creating student with default constructor
		Student student2 = new Student();
		student2.setName("Robin");
		student2.setId(5);
		
		// Creating student with parameterized constructor
		// no need for setter, but can call setters in the constructor (if they exist)
		Student student3 = new Student("Robin", 5); 
		
		System.out.println("Student 2's instructor is: " + student2.getInstructor() );
		student2.setInstructor("JimR");
		System.out.println("Oh no Prof. Ekin got hit by a car! time to change professor... :'(");
		System.out.println("Student 1's instructor is: " + student1.getInstructor() );
		System.out.println("Student 2's instructor is: " + student2.getInstructor() );
	
	
		// Printing object references
		System.out.println("Student 1 obj. ref:" + student1);
		System.out.println("Student 2 obj. ref:" + student2);
		System.out.println("Student 3 obj. ref:" + student3);
		Student student5 = student3; 
		System.out.println("Student 5 obj. ref:" + student5 + ", name = " + student5.getName());
		
		System.out.println("Student 3 obj. ref:" + student3);
		Student student4 = new Student(student3);
		System.out.println("Student 4 obj. ref:" + student4 + ", name = " + student4.getName());
		
		student3.setName("Bruce");
		
		System.out.println("Student 5 obj. ref:" + student5 + ", name = " + student5.getName());
		System.out.println("Student 4 obj. ref:" + student4 + ", name = " + student4.getName());
	}

}
