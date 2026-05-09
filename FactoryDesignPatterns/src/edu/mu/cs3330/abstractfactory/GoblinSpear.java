package edu.mu.cs3330.abstractfactory;

public class GoblinSpear implements Spear {

	public GoblinSpear() {
		System.out.println("Created a Goblin Spear");
	}	
	
	@Override
	public void attack() {
		poke();
	}

	@Override
	public void poke() {
		System.out.println("Poking with a Goblin Spear");
	}

}
