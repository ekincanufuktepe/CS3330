package ex1;

public class InvalidStudentAgeException extends Exception {
	
	public InvalidStudentAgeException(Integer age) {
		System.err.println("You have an invalid age: " + age.intValue());
	}
	
	public InvalidStudentAgeException(Student s) {
		System.err.println("(S)You have an invalid age: " + s.getAge().intValue());
	}

}
