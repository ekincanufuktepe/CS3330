package generics.wildcards;

import java.util.List;

public class Company {
	
	public Company() {
		
	}
	
	public void printWorkersUsingUpperBoundary(List<? extends Employee> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void printWorkersUsingLowerBoundary(List<? super Employee> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
