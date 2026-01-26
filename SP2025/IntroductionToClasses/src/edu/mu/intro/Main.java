package edu.mu.intro;

public class Main {

	public static void main(String[] args) {
		Student jeremiah = new Student();
		jeremiah.firstname = "Jeremiah";
		jeremiah.lastname = "Ezekiel";
		jeremiah.GPA = 1.8;
		
		Student john = new Student();
		john.firstname = "John";
		
		System.out.println("Firstname: " + jeremiah.firstname);
		System.out.println("Firstname: " + john.firstname);
		
	}

}
