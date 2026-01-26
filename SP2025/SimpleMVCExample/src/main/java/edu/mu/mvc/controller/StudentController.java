package edu.mu.mvc.controller;

import edu.mu.mvc.model.Student;
import edu.mu.mvc.view.StudentView;

public class StudentController {
	
	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view) {
		super();
		this.model = model;
		this.view = view;
	}
	
	public String getStudentName() {
		return model.getName();
	}
	
	public void setStudentName(String newStudentName) {
		model.setName(newStudentName);
		updateStudentView();
	}
	
	public int getStudentNumber() {
		return model.getNumber();
	}
	
	public void setStudentNumber(int newStudentNumber) {
		model.setNumber(newStudentNumber);
		updateStudentView();
	}
	
	public void updateStudentView() {
		view.printStudentDetails(getStudentName(), getStudentNumber());
	}
	

}
