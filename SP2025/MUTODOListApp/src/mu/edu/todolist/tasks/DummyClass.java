package mu.edu.todolist.tasks;

// You also get access to protected members through inheritance
//public class DummyClass extends Task {
public class DummyClass {

	private Task task;
	
	public DummyClass() {
		task = new Task();
		// can access the printStatus method, because they are in the same package
		task.printStatus();
	}
	
}
