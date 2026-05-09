package edu.mu.cs3330.dragon;

import edu.mu.cs3330.slayingstrategy.BigArrowStrategy;
import edu.mu.cs3330.slayingstrategy.SpellStrategy;

public abstract class AbstractDragon {
	
	public abstract void receive(BigArrowStrategy strategy);
	public abstract void receive(SpellStrategy strategy);

}
