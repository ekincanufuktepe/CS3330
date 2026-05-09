package edu.mu.cs3330;

import edu.mu.cs3330.controller.StudentController;
import edu.mu.cs3330.model.StudentModel;
import edu.mu.cs3330.view.StudentView;

public class Main {

	public static void main(String[] args) {
		
		StudentModel model = new StudentModel("Ekin", 007, "A+++");
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		
//		StudentController controller = new StudentController(new StudentModel("Ekin", 007, "A+++"), 
//															new StudentView());
		
		controller.updateView();
		
	}

}
