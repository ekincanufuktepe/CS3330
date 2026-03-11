package edu.mu.cs3330.genericclass;

public class Main {

	public static void main(String[] args) {
		Task[] tasks = new Task[3];
		
		tasks[0] = new Task("Homework");
		tasks[1] = new Task("Eat");
		tasks[2] = new Task("Sleep");
				
		Container<Task> taskContainer = new Container<Task>();
		taskContainer.setContainer(tasks);
		
		for(Task t : taskContainer.getContainer()) {
			System.out.println(t);
		}
		
		Integer[] integers = new Integer[3];
		integers[0] = 1;
		integers[1] = 5;
		integers[2] = 9;
		Container<Integer> integerContainer = new Container<Integer>();
		integerContainer.setContainer(integers);
		
		for(Integer i : integerContainer.getContainer()) {
			System.out.println(i);
		}
		

	}

}
