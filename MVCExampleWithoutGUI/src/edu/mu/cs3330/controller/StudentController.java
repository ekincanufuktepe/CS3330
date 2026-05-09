package edu.mu.cs3330.controller;

import edu.mu.cs3330.model.StudentModel;
import edu.mu.cs3330.view.StudentView;

public class StudentController {
	
	private StudentModel model;
	private StudentView view;
	
	public StudentController(StudentModel model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	
//	public StudentController() {
//		this.model = new StudentModel(getStudentName(), getStudentId(), getStudentGradeLetter())
//		this.view = new StudentView();
//	}
	
	public void setStudentName(String name) {
		model.setName(name);
	}
	
	public String getStudentName() {
		return model.getName();
	}
	
	public void setStudentId(Integer id) {
		model.setId(id);
	}
	
	public Integer getStudentId() {
		return model.getId();
	}
	
	public void setStudentGradeLetter(String letter) {
		model.setGradeLetter(letter);
	}
	
	public String getStudentGradeLetter() {
		return model.getGradeLetter();
	}
	
	public void updateView() {
		view.printStudentDetails(getStudentName(), getStudentId(), getStudentGradeLetter());
	}
	

}
