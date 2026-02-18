package edu.mu.cs3330.dmd;

import edu.mu.cs3330.dmd.characters.GameCharacter;
import edu.mu.cs3330.dmd.characters.Mage;
import edu.mu.cs3330.dmd.characters.Warrior;

public class Main {

	public static void main(String[] args) {
		GameCharacter nene = new Mage("Nene", 300);
		nene.greet();
		nene.attack(1000000);
		
		GameCharacter ethan = new Warrior("Ethan", 1);
		ethan.greet();
		ethan.attack(Integer.MAX_VALUE);
	}

}
