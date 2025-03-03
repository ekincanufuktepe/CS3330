package edu.mu.dragonslayer;

import edu.mu.dragonslayer.characters.Dragon;
import edu.mu.dragonslayer.characters.DragonSlayer;
import edu.mu.dragonslayer.characters.DragonType;
import edu.mu.dragonslayer.strategy.SpellStrategy;
import edu.mu.dragonslayer.strategy.StabStrategy;

public class Main {

	public static void main(String[] args) {
		DragonSlayer slayer = new DragonSlayer("Toby");
		Dragon joe = new Dragon(100, "Joe", DragonType.SILVER_DRAGON);
	
		slayer.changeStrategy(new SpellStrategy());
		System.out.println(joe);
		slayer.attack(joe);
		slayer.changeStrategy(new StabStrategy());
		slayer.attack(joe);
		System.out.println(joe);
	}

}
