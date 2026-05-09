package edu.mu.cs3330.abstractfactory;

public class DwarfSpear implements Spear {
	
	public DwarfSpear() {
		System.out.println("Created a Dwarf Spear");
	}

	@Override
	public void attack() {
		poke();
	}

	@Override
	public void poke() {
		System.out.println("Poking with a Dwarf Spear");
	}

}
