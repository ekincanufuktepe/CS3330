package edu.mu.cs3330.genericmethods;

public class Task {
	
	private String taskName;

	public Task(String taskName) {
		super();
		this.taskName = taskName;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

//	@Override
//	public String toString() {
//		return "Task [taskName=" + taskName + "]";
//	}
}
