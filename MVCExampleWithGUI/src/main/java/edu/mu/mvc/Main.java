package edu.mu.mvc;

import javax.swing.SwingUtilities;

import edu.mu.mvc.controller.UserInformationController;
import edu.mu.mvc.model.UserInformationContainerModel;
import edu.mu.mvc.model.UserInformationModel;
import edu.mu.mvc.view.UserInputView;

public class Main {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Instantiate the Controller(s) and pass the
				// related View and Model components
				UserInformationController controller = new UserInformationController(
																new UserInformationContainerModel(),
																new UserInputView());
				controller.initiate();
				
			}
		});

	}

}
