package edu.mu.cs3330.factorymethod;

public class OreoFactory extends AbstractCandyFactory {

	@Override
	public AbstractCandy createCandy() {
		return new OreoCandy();
	}

}
