package edu.mu.petmonitor.userprofiles;

public class Pet {
	
	private String name;
	private final int numberOfLegs = 8;
	
	@Override
	public String toString() {
		return "Pet [name=" + name + ", numberOfLegs=" + numberOfLegs + "]";
	}

	public Pet(String name) {
		this.name = name;
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
