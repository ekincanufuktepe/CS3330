package edu.mu.dragonslayer.characters;

public class Dragon {
	
	private int HP;
	private String name;
	private DragonType type;
	
	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DragonType getType() {
		return type;
	}

	public void setType(DragonType type) {
		this.type = type;
	}
	
	public String ineffectiveAttackMessage() {
		return name + " says: Haha that tickled!";
	}

	public Dragon(int hP, String name, DragonType type) {
		super();
		HP = hP;
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Dragon [HP=" + HP + ", name=" + name + ", type=" + type + "]";
	}
	
	

}
