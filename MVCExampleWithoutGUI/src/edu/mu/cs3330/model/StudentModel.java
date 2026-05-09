package edu.mu.cs3330.model;

public class StudentModel {
	
	private String name;
	private Integer id;
	private String gradeLetter;
	
	public StudentModel(String name, Integer id, String gradeLetter) {
		this.name = name;
		this.id = id;
		this.gradeLetter = gradeLetter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGradeLetter() {
		return gradeLetter;
	}

	public void setGradeLetter(String gradeLetter) {
		this.gradeLetter = gradeLetter;
	}
}
