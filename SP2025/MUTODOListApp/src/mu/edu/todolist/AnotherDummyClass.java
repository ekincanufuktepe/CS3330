package mu.edu.todolist;

import mu.edu.todolist.tasks.Task;

public class AnotherDummyClass {
	
	private Task task;
	
	public AnotherDummyClass() {
		task = new Task();
		// Cannot access the method printStatus() method from Task
		// because they are not under the same package.
	}

}
