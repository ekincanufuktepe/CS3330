package edu.mu.cs3330.abstractfactory;

public class GoblinSword implements Sword {
	
	public GoblinSword() {
		System.out.println("Created a Goblin Sword");
	}

	@Override
	public void attack() {
		swing();
	}

	@Override
	public void swing() {
		System.out.println("Swinging my Goblin Sword");
	}

}
