package edu.mu.cs3330.good;

public class Sparrow extends Bird {

	public Sparrow(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Sparrow cannot fly");
	}
}
