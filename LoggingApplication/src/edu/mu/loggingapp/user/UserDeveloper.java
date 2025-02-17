package edu.mu.loggingapp.user;

import edu.mu.loggingapp.logger.LoggerSingleton;

public class UserDeveloper {
	private static int IDCounter = 1;
	private int developerID;
	
	public UserDeveloper() {
		this.developerID = IDCounter;
		IDCounter++;
	}

	public int getDeveloperID() {
		return developerID;
	}
	
	public void addAction() {
		String msg = "Developer #" + developerID + " added something.";
		LoggerSingleton.getInstance().logUser(msg);
	}
	
	public void deleteAction() {
		String msg = "Developer #" + developerID + " deleted something.";
		LoggerSingleton.getInstance().logUser(msg);
	}
		
}
