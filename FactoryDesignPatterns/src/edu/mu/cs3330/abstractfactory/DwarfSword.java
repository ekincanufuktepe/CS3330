package edu.mu.cs3330.abstractfactory;

public class DwarfSword implements Sword {

	public DwarfSword() {
		System.out.println("Created a Dwarf Sword");
	}
	
	@Override
	public void attack() {
		swing();
	}

	@Override
	public void swing() {
		System.out.println("Swinging my Dwarf Sword");
	}

}
