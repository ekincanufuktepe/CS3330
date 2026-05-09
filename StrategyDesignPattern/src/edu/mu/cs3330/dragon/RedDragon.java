package edu.mu.cs3330.dragon;

import edu.mu.cs3330.slayingstrategy.BigArrowStrategy;
import edu.mu.cs3330.slayingstrategy.SpellStrategy;

public class RedDragon extends AbstractDragon {

	@Override
	public void receive(BigArrowStrategy strategy) {
		System.out.println("I am weak against big arrows, said the Red Dragon");
	}

	@Override
	public void receive(SpellStrategy strategy) {
		System.out.println("Hahahah that tickled, said the big bad Red Dragon");
	}

}
