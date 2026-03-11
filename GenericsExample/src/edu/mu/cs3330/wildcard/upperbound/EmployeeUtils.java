package edu.mu.cs3330.wildcard.upperbound;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtils {
	
	public static void printEmployee(List<? extends Employee> list) {
		for(Employee e : list) {
			System.out.println(e.getName());
		}
	}
	
	public static void print(List<? super JuniorDeveloper> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static <T> void safeAdd(List<? super T> list, T obj) {
		list.add(obj);
	}
	
	public static <T> void safeAddAll(List<? super T> destination, List<T> source) {
		for(T item : source) {
			destination.add(item);
		}
	}

}
