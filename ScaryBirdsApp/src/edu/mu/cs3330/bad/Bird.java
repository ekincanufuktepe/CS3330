package edu.mu.cs3330.bad;

public class Bird {
	
	private BirdType type;
	private String name;
	
	
	
	public Bird(BirdType type, String name) {
		this.type = type;
		this.name = name;
	}

	public void fly() {
		if(type == BirdType.SPARROW) {
			System.out.println("Sparrow can fly!");
		}
		else if(type == BirdType.CHICKEN) {
			System.out.println("I love to see them fly one day (Chicken)");
		}
		else if(type == BirdType.PENGUIN) {
			System.out.println("Not from Batman, but this one cannot also fly (Penguin)");
		}
		else if(type == BirdType.ROBIN) {
			System.out.println("Now Robins can really fly!");
		}
		else {
			System.out.println("NOT A BIRD TYPE");
		}
	}
	
	

}
