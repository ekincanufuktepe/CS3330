package edu.mu.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class UserInformationContainerModel {
	
	private List<UserInformationModel> userList;
	
	public UserInformationContainerModel() {
		userList = new ArrayList<UserInformationModel>();
	}

	public List<UserInformationModel> getUserList() {
		return userList;
	}

	public void setUserList(List<UserInformationModel> userList) {
		this.userList = userList;
	}

}
