package edu.mu.cs3330.slayingstrategy;

import edu.mu.cs3330.dragon.AbstractDragon;

public interface IDragonSlayingStrategy {

	public boolean attack(AbstractDragon dragon, Integer damage);
}
