package edu.mu.zoo;

public class Animal {

	private String name;
	protected int age;
	
	public Animal(String name) {
		this.name = name;
		System.out.println("Animal object created. Name: " + this.name);
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Animal object created. Name: " + this.name + ", age:" + this.age);
	}
	
	protected void whoami() {
		System.out.println("I am " + name);
	}
	
}
