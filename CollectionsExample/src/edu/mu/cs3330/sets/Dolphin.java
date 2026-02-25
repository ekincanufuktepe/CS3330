package edu.mu.cs3330.sets;

import java.util.Objects;

public class Dolphin {
	
	private String name;
	private Integer id;
	
	public Dolphin(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id.intValue();
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Dolphin))
			return false;
		Dolphin dolphin = (Dolphin) obj; // d2
		if(getId() == dolphin.getId()) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id.intValue());
	}
	
	/***
	 * This is my custom equals method
	 * @param obj
	 * @return
	 */
	public boolean equals(Dolphin obj) {
		if(!(obj instanceof Dolphin))
			return false;
		Dolphin dolphin = (Dolphin) obj; // d2
		if(getId() == dolphin.getId()) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Dolphin [name=" + name + ", id=" + id + "]";
	}
	
	

}
