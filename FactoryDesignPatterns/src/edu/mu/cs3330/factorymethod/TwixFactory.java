package edu.mu.cs3330.factorymethod;

public class TwixFactory extends AbstractCandyFactory {

	@Override
	public AbstractCandy createCandy() {
		return new TwixCandy();
	}

}
