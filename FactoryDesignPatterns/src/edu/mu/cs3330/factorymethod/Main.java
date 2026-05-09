package edu.mu.cs3330.factorymethod;

public class Main {

	public static void main(String[] args) {
		AbstractCandyFactory factory = new OreoFactory();
		factory.createCandy();
		factory.createCandy();
		factory.createCandy();
		factory.createCandy();
		factory = new TwixFactory();
		factory.createCandy();
		factory.createCandy();
		factory.createCandy();
		factory.createCandy();
	}

}
