package edu.mu.cs3330.good;

public class Penguin extends Bird {

	public Penguin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Penguins cannot fly");
	}

}
