package mu.edu.todolist;

import java.time.LocalDateTime;

import mu.edu.todolist.tasks.PersonalTask;
import mu.edu.todolist.tasks.Task;
import mu.edu.todolist.tasks.WorkTask;

public class Main {

	public static void main(String[] args) {
//		Task task = new Task();
		Task[] myTasks = new Task[5];
//		Task workTask = new WorkTask("Pay Bills", "Don't forget to pay the utility bills.", LocalDateTime.now(), 1);
//		myTasks[0] = workTask;
		
		myTasks[0] = new WorkTask("Pay Bills", "Don't forget to pay the utility bills.", LocalDateTime.now(), 1);
		myTasks[1] = new PersonalTask("Take Emma to vet", "Emma has a fever, and needs attention.", "MU Vet Hospital"); 
		myTasks[2] = new WorkTask("Finish CS3330 Group Assignment 2", "I hate Dr. Ekin and this assignment.", LocalDateTime.of(2025, 1, 14, 2, 2), 3);
		
		for(int i=0; i<myTasks.length; i++) {
			if(myTasks[i] != null) {
				
//				System.out.println(myTasks[i].getClass());
				
				if(myTasks[i].getClass().getSimpleName().equals("WorkTask")) {
//				if(myTasks[i] instanceof WorkTask) {
					System.out.println("Found a Work Task");
					((WorkTask)myTasks[i]).extendDeadlineInDays(5);
				}
				myTasks[i].displayTask();
//				System.out.println();
				System.out.println();
			}
		}
		//		System.out.println("Description: " + workTask.getDescription());
//		workTask.displayTask();
		System.out.println();
//		workTask.extendDeadlineInDays(4);
//		System.out.println();
//		workTask.displayTask();
//		System.out.println();
//		PersonalTask personalTask = new PersonalTask("Take Emma to vet", "Emma has a fever, and needs attention.", "MU Vet Hospital");
//		personalTask.displayTask();
	}


}
