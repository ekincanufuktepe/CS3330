package mu.edu.todolist.tasks;

public class Task {
	private String title;
	private String description;
	private boolean isCompleted;
	
	/**
	 * Default Constructor
	 */
	public Task() {
		System.out.println("Task object created!");
	}
	
	/**
	 * Parameterized Constructor
	 * @param title
	 * @param description
	 */
	public Task(String title, String description) {
		super();
		this.title = title;
		this.description = description;
		this.isCompleted = false;
	}
	
	protected void printStatus() {
		System.out.println("This is just printing the status from class Task.");
	}
	
	public void markCompleted() {
		this.isCompleted = true;
	}
	
	
	// Method "Overloading" example
	public void iLoveYou() {
		System.out.println("I love you");
	}
	// Method "Overloading" example
	public void iLoveYou(String lover) {
		System.out.println("I love you " + lover);
	}
	
	public void markIncomplete() {
		this.isCompleted = false;
	}
	
	public void displayTask() {
		System.out.println("Title: " + this.title + ", Description: " + this.description);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	
}
