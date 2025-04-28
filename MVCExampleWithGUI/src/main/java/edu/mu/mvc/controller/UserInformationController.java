package edu.mu.mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import edu.mu.mvc.model.UserInformationContainerModel;
import edu.mu.mvc.model.UserInformationModel;
import edu.mu.mvc.view.UserInformationListView;
import edu.mu.mvc.view.UserInputView;

public class UserInformationController {
	
//	private UserInformationModel userModel;
	private UserInformationContainerModel userContainerModel;
	private UserInputView userInputView;
	private UserInformationListView userListView;
	
//	public UserInformationController(UserInformationModel userModel, UserInputView userInputView) {
//		this.userInputView = userInputView;
//		this.userModel = userModel;
//		this.userInputView.addActionListenerToSubmitButton(new SubmitButtonActionListener());
//	}
	
	public UserInformationController(UserInformationContainerModel userContainerModel, UserInputView userInputView) {
		this.userInputView = userInputView;
		this.userContainerModel = userContainerModel;
		this.userInputView.addActionListenerToSubmitButton(new SubmitButtonActionListener());
		this.userListView = new UserInformationListView();
		this.userListView.addActionListenerToDeleteUserButton(new DeleteUserButtonActionListener());
	}
	
	public void initiate() {
		userInputView.setVisible(true);
	}
	
	private class SubmitButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
//			userModel.setUsername(userInputView.getUserName());
//			userModel.setAge(userInputView.getUserAge());
			UserInformationModel user = new UserInformationModel(userInputView.getUserName(), userInputView.getUserAge());
			userContainerModel.getUserList().add(user);
			System.out.println(userContainerModel.getUserList());
			userListView.getUserList().addElement(user);
			userListView.setVisible(true);
			
		}
		
	}
	
	private class DeleteUserButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
//			int selectedUserIndex = userListView.getSelectedUser();
			int[] multipleSelectedUserIndicies = userListView.getMultipleSelectedUser();
			List<UserInformationModel> userList = new ArrayList<>();
			for(int i=0; i<multipleSelectedUserIndicies.length; i++) {
				userList.add(userListView.getUserList().get(multipleSelectedUserIndicies[i]));
			}
			
			for(UserInformationModel user : userList) {
				userListView.getUserList().removeElement(user);
				userContainerModel.getUserList().remove(user);
			}
			
			for(UserInformationModel user : userContainerModel.getUserList()) {
				System.out.println("User: " + user);
			}
		}
		
	}

}
