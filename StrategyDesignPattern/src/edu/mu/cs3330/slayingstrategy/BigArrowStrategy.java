package edu.mu.cs3330.slayingstrategy;

import edu.mu.cs3330.dragon.AbstractDragon;

public class BigArrowStrategy implements IDragonSlayingStrategy {

	@Override
	public boolean attack(AbstractDragon dragon, Integer damage) {
		System.out.println("Throwing a very big arrow!");
		dragon.receive(this);
		return true;
	}

}
