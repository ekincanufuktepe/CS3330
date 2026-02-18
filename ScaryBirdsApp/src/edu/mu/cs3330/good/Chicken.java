package edu.mu.cs3330.good;

public class Chicken extends Bird {

	public Chicken(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Chickens cannot fly");
	}

}
