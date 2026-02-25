package edu.mu.cs3330.maps;

public class Student {
	
	private Integer studentID;
	private String studentName;
	
	public Student(Integer studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + "]";
	}
}
