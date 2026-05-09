package edu.mu.cs3330;

import edu.mu.cs3330.dragon.AbstractDragon;
import edu.mu.cs3330.dragon.RedDragon;
import edu.mu.cs3330.dragon.YellowDragon;
import edu.mu.cs3330.dragonslayer.DragonSlayer;
import edu.mu.cs3330.slayingstrategy.SpellStrategy;

public class Main {

	public static void main(String[] args) {
		DragonSlayer slayer = new DragonSlayer("Charles", 5, 5);
		AbstractDragon dragon = new RedDragon();
		
		slayer.executeAttack(dragon);
		slayer.changeStrategy(new SpellStrategy());
		slayer.executeAttack(dragon);
	}

}
