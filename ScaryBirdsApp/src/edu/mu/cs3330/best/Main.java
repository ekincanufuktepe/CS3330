package edu.mu.cs3330.best;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Bird b1 = new Robin("Jasper");
//		b1.fly();
		Bird b2 = new Penguin("Oswald");
//		b2.fly();
		Bird b3 = new Chicken("Omlett");
//		b3.fly();
		Bird b4 = new Sparrow("Jack");
		
		ArrayList<Bird> birdList = new ArrayList<>();
		birdList.add(b1);
		birdList.add(b2);
		birdList.add(b3);
		birdList.add(b4);
		
		for(Bird b : birdList) {
			if(b instanceof Flyable) {
				((Flyable) b).fly();
			}
		}
		
		
		Flyable f1 = new Robin("Jasper");
		Flyable f4 = new Sparrow("Jack");
		ArrayList<Flyable> flyingBirdList = new ArrayList<>();
		flyingBirdList.add(f1);
		flyingBirdList.add(f4);
		
		for(Flyable f : flyingBirdList) {
			f.fly();
		}
		
	}

}
