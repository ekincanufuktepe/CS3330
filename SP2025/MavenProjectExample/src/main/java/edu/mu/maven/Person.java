package edu.mu.maven;

public class Person {
	
	private String name;
	private int age;
	private boolean isStudent;
	
	
	public Person(String name, int age, boolean isStudent) {
		super();
		this.name = name;
		this.age = age;
		this.isStudent = isStudent;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isStudent() {
		return isStudent;
	}


	public void setStudent(boolean isStudent) {
		this.isStudent = isStudent;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", isStudent=" + isStudent + "]";
	}
	
	

}
