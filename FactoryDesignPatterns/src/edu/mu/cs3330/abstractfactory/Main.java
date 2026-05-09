package edu.mu.cs3330.abstractfactory;

public class Main {

	public static void main(String[] args) {
		WeaponFactory factory = new DwarfWeaponFactory();
		factory.createSpear();
		factory.createSpear();
		factory.createSword();
		factory.createSword();
		factory.createSword();
		DwarfWeaponFactory dFactory = ((DwarfWeaponFactory)factory);
		dFactory.createAxe();
		dFactory.createAxe();
		dFactory.createAxe();
		factory = new GoblinWeaponFactory();
		factory.createSpear();
		factory.createSword();
	}

}
