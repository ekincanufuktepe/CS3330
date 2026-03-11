package edu.mu.cs3330.week2;

public class Student {
	
	private String name;
	private int id;
	private static String instructor = "Prof. Ekin";
	
	// Default constructor
	public Student() {
		System.out.println("Student object created!");
	}
	
	public Student(Student std) {
		this.id = std.getId();
		this.name = std.getName();
//		this.instructor = std.getInstructor();	
	}
	
	// Parameterized Constructor
	public Student(String name) {
		super();
		this.name = name;
	}

	// Parameterized Constructor
	public Student(String name, int id) {
		super();
		this.name = name;
		if(id < 0) {
			this.id = 0;
		}
		else {
			this.id = id;
		}
//		setId(id); // alternative
	}

	public String getName() {
		return name;
	}
	
	// default setter
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	// default setter
//	public void setId(int id) {
//		this.id = id;
//	}
	
	// custom setter (better)
	public boolean setId(int id) {
		if(id < 0) {
//			id = 0;
			System.out.println("id setting failed, initializin to 0");
			id = 0;
			return false;
		}
		this.id = id;
		return true;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

}
