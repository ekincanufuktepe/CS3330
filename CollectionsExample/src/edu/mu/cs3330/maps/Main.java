package edu.mu.cs3330.maps;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, Student> studentMap = new HashMap<>();
		studentMap.put("abc123", new Student(1, "Michael"));
		studentMap.put("qwe456", new Student(2, "Alice"));
		studentMap.put("fgh908", new Student(3, "Bob"));
		
		String s = "Hi";
//		s = "bye";
//		System.out.println(s);
		
		System.out.println(studentMap.size());
		System.out.println(studentMap);
		System.out.println(studentMap.keySet());
		System.out.println(studentMap.get("qwe456"));
		
		for(String key : studentMap.keySet()) {
			if(studentMap.get(key).getStudentName().equals("Alice")) {
				System.out.println("Alice found!");
			}
			else {
				System.out.println("Failed, I found: " + studentMap.get(key).getStudentName());
			}
		}
		
	}

}
