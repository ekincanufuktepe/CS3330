package edu.mu.cs3330.best;

public class Robin extends Bird implements Flyable {

	public Robin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Robins can fly");
	}

	@Override
	public String toString() {
		return "Robin []";
	}
	
}
