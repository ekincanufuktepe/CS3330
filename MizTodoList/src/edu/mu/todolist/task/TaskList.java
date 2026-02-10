package edu.mu.todolist.task;

public class TaskList {

	private Task[] taskList = null;

	public TaskList() {
		this.taskList = new Task[5];
	}

	public boolean addTask(String description) {
		int availableIndex = findAvailableIndex();
		if(availableIndex == -1) 
			return false;
		taskList[availableIndex] = new Task(description);
		return true;
	}

	private int findAvailableIndex() {
		for(int i=0; i<taskList.length; i++) {
			if(taskList[i] == null) 
				return i;
		}
		return -1;
	}
	
	private int findTaskById(int taskID) {
		for(int i=0; i<taskList.length; i++) {
			if(taskList[i] != null) {
				if(taskList[i].getTaskId() == taskID) {
					return i;
				}
			}
		}
		return -1;
	}

	public Task[] getIncompleteTasks() {
		Task[] copyOfTaskList = new Task[taskList.length];
		int index = 0;
		for(int i=0; i<taskList.length; i++) {
			if(taskList[i] != null) {
				if(!taskList[i].isCompleted()) {
					copyOfTaskList[index] = taskList[i];
					index++;
				}
			}
		}
		return copyOfTaskList;
	}
	
	public boolean completeTaskById(int taskID) {
		for(int i=0; i<taskList.length; i++) {
			if(taskList[i] != null) {
				if(taskList[i].getTaskId() == taskID) {
					return taskList[i].markComplete();
				}
			}
		}
		return false;
	}
	
	public boolean removeTaskById(int taskID) {
		int victimTaskIndex = findTaskById(taskID);
		if(victimTaskIndex == -1) {
			return false;
		}
		taskList[victimTaskIndex] = null;
		return true;
	}

}
