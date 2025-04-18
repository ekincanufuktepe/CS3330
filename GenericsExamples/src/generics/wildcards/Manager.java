package generics.wildcards;

public class Manager extends Employee {
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public void managerMethod() {
		System.out.println("Manager");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is a Manager";
	}
}
