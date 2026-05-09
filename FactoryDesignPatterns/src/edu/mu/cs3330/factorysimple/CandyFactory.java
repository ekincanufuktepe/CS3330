package edu.mu.cs3330.factorysimple;

public class CandyFactory {
	
	public static AbstractCandy createCandy(CandyType candyType) {
		if(candyType.equals(CandyType.OREO)) 
			return new OreoCandy();
		else if(candyType.equals(CandyType.TWIX))
			return new TwixCandy();
		else
			return null;
	}

}
