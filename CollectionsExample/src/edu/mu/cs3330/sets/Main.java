package edu.mu.cs3330.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Set<Dolphin> dolphins = new HashSet<>();
//		List<Dolphin> dolphins = new ArrayList<>();
		dolphins.add(new Dolphin("Jasper", 1));
		dolphins.add(new Dolphin("Fido", 2));
		
		Dolphin d2 = new Dolphin("Sam", 2);
		if(!dolphins.contains(d2)) {
			dolphins.add(d2);
		}
//		Bat b = new Bat();
//		Dolphin d1 = new Dolphin("John", 5);
//		d1.equals(b);
		
		
//		dolphins.add(new Dolphin("Fido", 2));
		
		System.out.println("Size of dolphin set: " + dolphins.size());
		System.out.println(dolphins);
	}

}
