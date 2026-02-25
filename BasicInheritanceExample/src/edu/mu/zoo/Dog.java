package edu.mu.zoo;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
		super.whoami();
	}
	
	public Dog(String name, int age) {
		super(name,age);
		super.whoami();
	}
	
	
}
