package app;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(9);
		list.add(0);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Bob", 25));
		studentList.add(new Student("Alice", 23));
		studentList.add(new Student("Charlie", 18));
	
		System.out.println(studentList);
		Collections.sort(studentList);
		System.out.println(studentList);
		
		Collections.sort(studentList, new StudentComparatorByName());
		System.out.println(studentList);
		
		
		
	}

}
