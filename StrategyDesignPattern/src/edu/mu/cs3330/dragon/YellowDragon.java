package edu.mu.cs3330.dragon;

import edu.mu.cs3330.slayingstrategy.BigArrowStrategy;
import edu.mu.cs3330.slayingstrategy.SpellStrategy;

public class YellowDragon extends AbstractDragon {

	@Override
	public void receive(BigArrowStrategy strategy) {
		System.out.println("Thank you for the tooth pick");
	}

	@Override
	public void receive(SpellStrategy strategy) {
		System.out.println("Oh nooo, fairy dust, I am melting, said Yellow Dragon");
	}

}
