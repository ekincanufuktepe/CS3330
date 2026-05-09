package ex1;

public class Main {

	public static void main(String[] args) {
		
		try {
			Student s1 = new Student("Alice", -12);
		} catch (InvalidStudentAgeException e) {
			
			e.printStackTrace();
		}
	}

}
