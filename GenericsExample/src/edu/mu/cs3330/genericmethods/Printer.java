package edu.mu.cs3330.genericmethods;

public class Printer {
	
	public static <T> void print(T item) {
		System.out.println(item);
	}

}
