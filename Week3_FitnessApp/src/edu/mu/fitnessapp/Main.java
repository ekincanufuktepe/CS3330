package edu.mu.fitnessapp;

import edu.mu.fitnessapp.user.FitnessUser;
import edu.mu.fitnessapp.user.SystemAdministratorUser;

public class Main {

	public static void main(String[] args) {

		FitnessUser user1 = new FitnessUser();
//		user1.firstname = "Ekincan";
//		user1.lastname = "Ufuktepe";
//		System.out.println("User #1 Firstname: " + user1.firstname);
		user1.setFirstname("Ekincan");
		user1.setLastname("UFUKTEPE");
		user1.setSteps(0);
//		System.out.println("Lastname: " + user1.getLastname());
		System.out.println("User Info:" + user1);
		
		FitnessUser user2 = new FitnessUser();
		user2.setFirstname("Ekincan");
		user2.setLastname("UFUKTEPE");
		user2.setSteps(0);
		
		System.out.println("User #1:" + user1);
		System.out.println("User #2:" + user2);
		
		SystemAdministratorUser admin = new SystemAdministratorUser();
		admin.setLastname("Doe");
		admin.setName("Jane");
		
		if(user1.equals(user2)) {
			System.out.println("You have two same users");
		}
		
		for(int i=0; i<10; i++){
			user1.incrementSteps(2);
			System.out.println("User #1 Info: " + user1);
		}
		
	}

}
