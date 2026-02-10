package edu.mu.todolist;

import edu.mu.todolist.task.TaskManager;

public class Main {

	public static void main(String[] args) {
		
		TaskManager manager = new TaskManager();
		System.out.println(manager.newTask("Walk the dog"));
		System.out.println(manager.newTask("Clean cat's litterbox"));
		System.out.println(manager.newTask("Don't forget wife's birthday!"));
		System.out.println(manager.newTask("Pick up kid from school"));
		System.out.println(manager.newTask("Pick up groceries"));
		System.out.println(manager.newTask("Take a bath"));
		
		manager.viewIncompleteTasks();
		
		System.out.println(manager.completeTask(4));
		
		manager.viewIncompleteTasks();
		
		System.out.println(manager.removeTask(1));
		
		manager.viewIncompleteTasks();
	}

}
