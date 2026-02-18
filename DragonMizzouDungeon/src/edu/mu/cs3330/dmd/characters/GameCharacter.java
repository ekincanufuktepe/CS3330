package edu.mu.cs3330.dmd.characters;

public abstract class GameCharacter {
	private String name;
	private int health;
	
	public GameCharacter(String name, int health) {
		this.name = name;
		this.health = health;
	}
	
	public void greet() {
		System.out.println("I am " + name + ", and this is my health: " + health);
	}
	
	public abstract void attack(int hitPoints);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	

}
