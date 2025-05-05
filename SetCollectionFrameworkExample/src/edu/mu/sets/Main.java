package edu.mu.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person("Ekin", 55);
		Person p2 = new Person("Turner", 18);
		Person p3 = new Person("Ekin", 55);
		
		HashSet<Person> personSet = new HashSet<Person>();
		
		personSet.add(p2);
		personSet.add(p1);
		System.out.println(personSet.add(p3));
		
		System.out.println(personSet.size());
		
		personSet.remove(p3);
		
		for(Person p : personSet) {
			System.out.println(p);
		}
		
		

	}

}
