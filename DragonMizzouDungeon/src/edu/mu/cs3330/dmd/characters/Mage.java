package edu.mu.cs3330.dmd.characters;

public class Mage extends GameCharacter {

	public Mage(String name, int health) {
		super(name, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(int hitPoints) {
		System.out.println("The mage casts a fireball, did " + hitPoints + " damage");
	}

}
