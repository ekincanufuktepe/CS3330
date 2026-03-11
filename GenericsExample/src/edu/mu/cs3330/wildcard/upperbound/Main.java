package edu.mu.cs3330.wildcard.upperbound;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Manager> managers = new ArrayList<>();
		managers.add(new Manager("Kevin"));
		managers.add(new Manager("Karen"));
		
		EmployeeUtils.printEmployee(managers);
		
		List<JuniorDeveloper> juniors = new ArrayList<>();
		juniors.add(new JuniorDeveloper("Kevin Hart"));
		juniors.add(new JuniorDeveloper("Rock"));
		
		List<SeniorDeveloper> seniors = new ArrayList<>();
		seniors.add(new SeniorDeveloper("Jimr"));
		seniors.add(new SeniorDeveloper("Ekin"));
		
		EmployeeUtils.printEmployee(juniors);
		
		List<Developer> devs = new ArrayList<>();
		devs.add(new JuniorDeveloper("Ashton"));
		devs.add(new SeniorDeveloper("Spongebob"));
		
		EmployeeUtils.printEmployee(devs);
		
		List<President> presidents = new ArrayList<>();
		presidents.add(new President());
		presidents.add(new President());
		
		List<Employee> employees = new ArrayList<>();
		
//		EmployeeUtils.printEmployee(presidents);
//		EmployeeUtils.print(devs);
		JuniorDeveloper d = new JuniorDeveloper("alex");
		EmployeeUtils.safeAdd(employees, new Manager("Kevin"));
		System.out.println(employees);
		
		EmployeeUtils.safeAddAll(devs, juniors); //safe
		EmployeeUtils.safeAddAll(devs, seniors); //safe
//		EmployeeUtils.safeAddAll(juniors, seniors); // unsafe
//		EmployeeUtils.safeAddAll(seniors, juniors); // unsafe
		
		List<Object> objects = new ArrayList<Object>();
		
		EmployeeUtils.safeAddAll(objects, seniors);
		
		List<Hopable> hops = new ArrayList<>();
		List<Jumpable> jumps = new ArrayList<>();
		
		EmployeeUtils.safeAddAll(jumps, hops);
		
		
	}

}
