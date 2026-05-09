package edu.mu.cs3330.abstractfactory;

public class DwarfAxe implements Axe {
	
	public DwarfAxe() {
		System.out.println("Created a Dwarf Axe");
	}

	@Override
	public void attack() {
		chop();
	}

	@Override
	public void chop() {
		System.out.println("Dwarf says chop chop chop...");
	}

}
