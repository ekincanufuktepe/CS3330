package edu.mu.cs3330.slayingstrategy;

import edu.mu.cs3330.dragon.AbstractDragon;

public class SpellStrategy implements IDragonSlayingStrategy {

	@Override
	public boolean attack(AbstractDragon dragon, Integer damage) {
		System.out.println("Spell attack initiated");
		dragon.receive(this);
		return true;
	}

}
