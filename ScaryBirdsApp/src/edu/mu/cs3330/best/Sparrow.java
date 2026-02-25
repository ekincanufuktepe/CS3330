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
	
	@Override
	public void eat() {
		System.out.println("Munch munch much!!! says the " + this);
	}

	@Override
	public String toString() {
		return "Sparrow []";
	}
	
	
}
