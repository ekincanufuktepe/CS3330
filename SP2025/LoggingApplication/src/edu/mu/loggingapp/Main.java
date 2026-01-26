package edu.mu.loggingapp;

import edu.mu.loggingapp.user.UserDeveloper;
import edu.mu.loggingapp.user.UserIntern;

public class Main {

	public static void main(String[] args) {
		UserDeveloper dev1 = new UserDeveloper();
		dev1.addAction();
		dev1.addAction();
		UserDeveloper dev2 = new UserDeveloper();
		dev2.addAction();
		UserIntern intern1 = new UserIntern();
		intern1.deleteAction();
	}

}
