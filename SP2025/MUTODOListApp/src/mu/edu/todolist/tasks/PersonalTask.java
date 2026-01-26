package mu.edu.todolist.tasks;

public class PersonalTask extends Task {
	
	private String location;

	public PersonalTask(String title, String description, String location) {
		super(title, description);
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
//	@Override
	public void displayTask() {
		super.displayTask();
		System.out.println("Location: " + location);
	}

}
