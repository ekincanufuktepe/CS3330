package edu.mu.petmonitor.userprofiles;

public class Pet {
	
	private String name;
	private final int numberOfLegs = 8;
	private PetSpecies species;
	
	public PetSpecies getSpecies() {
		return species;
	}

	public void setSpecies(PetSpecies species) {
		this.species = species;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", numberOfLegs=" + numberOfLegs + "]";
	}
	
	/**
	 * Copy Constructor for the Pet class
	 * @param pet
	 */
	public Pet(Pet pet) {
		this.name = pet.getName();
		this.species = pet.getSpecies();
	}

	public Pet(String name) {
		this.name = name;
		this.species = PetSpecies.CAT;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	
	

}
