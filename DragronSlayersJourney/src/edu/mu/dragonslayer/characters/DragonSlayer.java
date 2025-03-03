package edu.mu.dragonslayer.characters;

import edu.mu.dragonslayer.strategy.IDragonSlayingStrategy;
import edu.mu.dragonslayer.strategy.StabStrategy;

public class DragonSlayer {
	
	private IDragonSlayingStrategy strategy;
	private String name;
	
	public DragonSlayer(String name) {
		super();
		this.name = name;
		this.strategy = new StabStrategy();
	}
	
	public void changeStrategy(IDragonSlayingStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void attack(Dragon victim) {
		System.out.println("Attacking " + victim.getName());
		System.out.println("Attacking with " + strategy.toString());
		strategy.execute(victim);
	}

}
