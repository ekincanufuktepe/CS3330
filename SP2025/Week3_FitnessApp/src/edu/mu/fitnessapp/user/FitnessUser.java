package edu.mu.fitnessapp.user;

public class FitnessUser {
	
	private String firstname;
	private String lastname;
//	private 
	private int steps;
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public boolean setLastname(String lastname) {
		if(lastname.contains("fuk")) {
			this.lastname = null;
			System.err.println("Your lastname contain profane language!");
			return false;
		}
		this.lastname = lastname;
		return true;
	}
	
	public int getSteps() {
		return steps;
	}
	
	public void setSteps(int steps) {
		this.steps = steps;
	}
	
	public boolean incrementSteps(int stepSize) {
		if(stepSize == 0) {
			return false;
		}
		steps += Math.abs(stepSize);
		return true;
	}

	@Override
	public String toString() {
		return "FitnessUser [firstname=" + firstname + ", lastname=" + lastname + ", steps=" + steps + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		FitnessUser user = (FitnessUser)obj;
		if(this.firstname.equals(user.getFirstname()) &&
				this.lastname.equals(user.getLastname())) {
			return true;
		}
		return false;	
	}
	

}
