package edu.mu.cs3330.factorysimple;

public class Main {

	public static void main(String[] args) {
		AbstractCandy candy = CandyFactory.createCandy(CandyType.OREO);
		CandyFactory.createCandy(CandyType.OREO);
		CandyFactory.createCandy(CandyType.OREO);
		CandyFactory.createCandy(CandyType.OREO);
		CandyFactory.createCandy(CandyType.OREO);
		CandyFactory.createCandy(CandyType.TWIX);
	}

}
