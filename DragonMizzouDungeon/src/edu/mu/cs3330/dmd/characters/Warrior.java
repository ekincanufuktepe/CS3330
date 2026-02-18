package edu.mu.cs3330.dmd.characters;

public class Warrior extends GameCharacter {

	public Warrior(String name, int health) {
		super(name, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(int hitPoints) {
		System.out.println("The warrior swings their sword, did " + hitPoints + " damage" );
	}

}
