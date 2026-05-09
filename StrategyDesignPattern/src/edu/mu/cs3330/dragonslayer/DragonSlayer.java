package edu.mu.cs3330.dragonslayer;

import edu.mu.cs3330.dragon.AbstractDragon;
import edu.mu.cs3330.slayingstrategy.BigArrowStrategy;
import edu.mu.cs3330.slayingstrategy.IDragonSlayingStrategy;

public class DragonSlayer {
	
	private IDragonSlayingStrategy strategy = null;
	private String name = null;
	private Integer damage = 0;
	private Integer HP = 0;
	
	public DragonSlayer(String name, Integer damage, Integer hP) {
		super();
		this.strategy = new BigArrowStrategy();
		this.name = name;
		this.damage = damage;
		HP = hP;
	}

	public boolean changeStrategy(IDragonSlayingStrategy newStrategy) {
		this.strategy = newStrategy;
		return true;
	}
	
	public boolean executeAttack(AbstractDragon dragon) {
		strategy.attack(dragon, damage);
		return true;
	}
	

}
