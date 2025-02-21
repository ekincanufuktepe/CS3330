package mu.edu.todolist.tasks;

import java.time.LocalDateTime;

public class WorkTask extends Task {

	private LocalDateTime deadline;
	private Integer priority;
	
	public WorkTask(String title, 
			String description, 
			LocalDateTime deadline, 
			Integer priority) {
//		super(title, description);
		super(title, description);
//		super(); // default constructor of parent class;
		this.deadline = deadline;
		this.priority = priority;
	}
	
	@Override
	public void displayTask() {
//		title = "Title Changed";
		super.displayTask();
		
		System.out.println("Deadline: " + deadline);
		System.out.println("Priority: " + priority);
	}
	
	public void extendDeadlineInDays(int days) {
		deadline = deadline.plusDays(days);
		System.out.println("Your task is extended, here is your new deadline: " + deadline);
	}
	
}
