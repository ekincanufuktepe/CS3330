package edu.mu.cs3330.best;

public abstract class Bird {
	
	private String name;
	
	public Bird(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("Yum yum yum... says the " + this);
	}

}
