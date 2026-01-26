package edu.mu.mvc.model;

public class UserInformationModel {
	
	private String username;
	private Integer age;
	
	public UserInformationModel(String username, Integer age) {
		super();
		this.username = username;
		this.age = age;
	}
	
	public UserInformationModel() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserInformatioModel [username=" + username + ", age=" + age + "]";
	}
	
	/**
	 * TODO: Do not forget to implement the equals method
	 */
	@Override
	public boolean equals(Object obj) {
		UserInformationModel user = (UserInformationModel) obj;
		if(this.username.equals(user.getUsername()) && this.age.intValue() == user.getAge().intValue()) {
			return true;
		}
		return false;
	}

}
