package edu.mu.cs3330.abstractfactory;

public class GoblinWeaponFactory implements WeaponFactory {

	@Override
	public Spear createSpear() {
		return new GoblinSpear();
	}

	@Override
	public Sword createSword() {
		return new GoblinSword();
	}

}
