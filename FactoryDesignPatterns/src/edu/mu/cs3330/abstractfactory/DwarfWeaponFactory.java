package edu.mu.cs3330.abstractfactory;

public class DwarfWeaponFactory implements WeaponFactory, AxeFactory {

	@Override
	public Spear createSpear() {
		return new DwarfSpear();
	}

	@Override
	public Sword createSword() {
		return new DwarfSword();
	}

	@Override
	public Axe createAxe() {
		return new DwarfAxe();
	}

}
