package edu.mu.dragonslayer.strategy;

import edu.mu.dragonslayer.characters.Dragon;
import edu.mu.dragonslayer.characters.DragonType;

public class StabStrategy implements IDragonSlayingStrategy {

	private int damage = 1;
	
	@Override
	public boolean execute(Dragon dragon) {
		if(dragon.getType() == DragonType.GREEN_DRAGON) {
			System.out.println(dragon.ineffectiveAttackMessage());
			return false;
		}
		dragon.setHP(dragon.getHP() - damage);
		return true;
	}
	
	@Override
	public String toString() {
		return "SPORK";
	}

}
