package edu.mu.cs3330.best;

public class Sparrow extends Bird implements Flyable {

	public Sparrow(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Sparrow cannot fly");
	}
}
