package edu.mu.cs3330.bad;

public class Main {

	public static void main(String[] args) {
		Bird robin = new Bird(BirdType.ROBIN, "Jasper");
		robin.fly();
		Bird chicken = new Bird(BirdType.CHICKEN, "Omlett");
		chicken.fly();
	}

}
