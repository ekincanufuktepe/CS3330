package generics.wildcards;

public class Employee extends Person {
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public void employeeMethod() {
		System.out.println("Employee");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is an Employee";
	}

}
