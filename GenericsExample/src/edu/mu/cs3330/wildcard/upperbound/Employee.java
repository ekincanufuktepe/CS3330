package edu.mu.cs3330.wildcard.upperbound;

public abstract class Employee {
	
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	protected String getName() {
		return name;
	}

}
