package edu.mu.dragonslayer.strategy;

import edu.mu.dragonslayer.characters.Dragon;
import edu.mu.dragonslayer.characters.DragonType;

public class SpellStrategy implements IDragonSlayingStrategy {

	private int damage = 7;
	@Override
	public boolean execute(Dragon dragon) {
		if(dragon.getType() == DragonType.SILVER_DRAGON) {
			System.out.println(dragon.ineffectiveAttackMessage());
			return false;
		}
		System.out.println("Spell Strategy was successful!");
		dragon.setHP(dragon.getHP() - damage);
		return true;
	}
	
	@Override
	public String toString() {
		return "Fairy dust...";
	}

}
