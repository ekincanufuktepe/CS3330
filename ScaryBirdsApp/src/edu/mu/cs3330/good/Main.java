package edu.mu.cs3330.good;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Bird b1 = new Robin("Jasper");
//		b1.fly();
		Bird b2 = new Penguin("Oswald");
//		b2.fly();
		Bird b3 = new Chicken("Omlett");
//		b3.fly();
		
		ArrayList<Bird> birdList = new ArrayList<>();
		birdList.add(b1);
		birdList.add(b2);
		birdList.add(b3);
		
		for(Bird b : birdList) {
			if(b instanceof Robin)
				b.fly();
		}
	}

}
