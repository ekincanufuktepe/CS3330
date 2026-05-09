package ex1;

public class Student {
	
	private String name;
	private Integer age;
	
	public Student(String name, Integer age) throws InvalidStudentAgeException {
		this.age = age;
		this.name = name;
		if(age.intValue() <= 0)
			throw new InvalidStudentAgeException(this);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	

}
