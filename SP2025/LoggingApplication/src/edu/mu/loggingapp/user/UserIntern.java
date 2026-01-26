package edu.mu.loggingapp.user;

import edu.mu.loggingapp.logger.LoggerSingleton;

public class UserIntern {
	private static int IDCounter = 1;
	private int internID;
	
	public UserIntern() {
		this.internID = IDCounter;
		IDCounter++;
	}

	public int getDeveloperID() {
		return internID;
	}
	
	public void addAction() {
		String msg = "Intern #" + internID + " added something.";
		LoggerSingleton.getInstance().logUser(msg);  
	}
	
	public void deleteAction() {
		String msg = "Intern #" + internID + " deleted something.";
		LoggerSingleton.getInstance().logUser(msg);
	}

}
