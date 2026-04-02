package edu.mu.cs3330.task;

public class TaskManager {
	
	private TaskList taskList = null;
	
	public TaskManager() {
		this.taskList = new TaskList();
	}
	
	public boolean newTask(String description) {
		return taskList.addTask(description);
	}
	
	public boolean removeTask(int taskID) {
		return taskList.removeTaskById(taskID);
	}
	
	public void viewIncompleteTasks() {
		Task[] copyOfTaskList = taskList.getIncompleteTasks();
		for(int i=0; i<copyOfTaskList.length; i++) {
			if(copyOfTaskList[i] != null) {
				System.out.println(copyOfTaskList[i]);
			}
		}
	}
	
	public boolean completeTask(int taskID) {
		return taskList.completeTaskById(taskID);
	}

}
