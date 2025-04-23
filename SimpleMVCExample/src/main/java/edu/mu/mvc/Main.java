package edu.mu.mvc;

import edu.mu.mvc.controller.StudentController;
import edu.mu.mvc.model.Student;
import edu.mu.mvc.view.StudentView;

public class Main {

	public static void main(String[] args) {
//		Student model = retrieveDB();
//		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(retrieveDB(), new StudentView());
//		StudentController controller = new StudentController(model, view);
		
		controller.updateStudentView();
		
		controller.setStudentName("Robin");
		
		controller.setStudentNumber(666);
		
//		controller.updateStudentView();
	}
	
	private static Student retrieveDB() {
		Student s = new Student("Ekincan", 123);
		return s;
	}
}
