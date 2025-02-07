package edu.mu.petmonitor.userprofiles;

import java.util.Arrays;

public class PetOwner {
	
	private String firstname;
	private String lastname;
	private Pet[] pets;
	private int numOfPets = 0;
	
	public PetOwner() {
		this.pets = new Pet[3];
		this.firstname = "NO_NAME";
		this.lastname = "NO_LASTNAME";
	}
	
	/**
	 * This is a parameterized constructor, that will
	 * allow you to create a PetOwner object with a 
	 * name and lastname.
	 * @param name This argument is the firstname of the pet owner
	 * @param lastname This argument is the lastname of the pet owner
	 */
	public PetOwner(String name, String lastname) {
		this.firstname = name;
		this.lastname = lastname;
		this.pets = new Pet[5];
	}
	
	public PetOwner(String name, String lastname, int numOfPets) {
		this.firstname = name;
		this.lastname = lastname;
		this.pets = new Pet[numOfPets];
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Pet[] getPets() {
		return pets;
	}
	public void setPets(Pet[] pets) {
		this.pets = pets;
	}
	
	
	public boolean adoptPet(Pet pet) {
		if(numOfPets == getPets().length) {
			return false;
		}
		pets[numOfPets] = pet;
		numOfPets++;
		return true;
	}

	@Override
	public String toString() {
		return "PetOwner [firstname=" + firstname + ", lastname=" + lastname + ", pets=" + Arrays.toString(pets) + "]";
	}

	public int getNumOfPets() {
		return numOfPets;
	}

	public void setNumOfPets(int numOfPets) {
		this.numOfPets = numOfPets;
	}

}
