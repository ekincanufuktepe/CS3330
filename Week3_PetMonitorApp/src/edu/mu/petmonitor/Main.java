package edu.mu.petmonitor;

import edu.mu.petmonitor.userprofiles.Pet;
import edu.mu.petmonitor.userprofiles.PetOwner;

public class Main {

	public static void main(String[] args) {
		PetOwner owner = new PetOwner();
		System.out.println("Name: " + owner.getFirstname());
		
		PetOwner ownerWithName = new PetOwner("Ekincan", "Ufuktepe");
		System.out.println("Name: " + ownerWithName.getFirstname());
		
		ownerWithName.adoptPet(new Pet("Peanut"));
		
		System.out.println("Ekin's pets:");
		for(int i=0; i<ownerWithName.getNumOfPets(); i++) {
			System.out.println("Pet: " + ownerWithName.getPets()[i]);
		}
		
	}

}
