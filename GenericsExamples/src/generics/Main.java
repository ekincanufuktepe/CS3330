package generics;

import java.util.ArrayList;
import generics.wildcards.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import generic.classes.MyCustomData;
import generic.classes.PairData;
import generics.boundedtypes.GenericsBoundedTypes;
import generics.method.Dwayne;
import generics.method.Rocks;

public class Main {

	public static void main(String[] args) {
//		MyCustomData<String> obj = new MyCustomData<String>("This is a string data");
//		System.out.println(obj.getData());
//		
//		MyCustomData<Integer> intObj = new MyCustomData<Integer>(4);
//		System.out.println(intObj.getData());
//		
//		PairData<Integer, String> pair = new PairData<Integer, String>(10, "Ekincan");
//		System.out.println(pair);
//		System.out.println("Key: " + pair.getKey());
//		System.out.println("Value: " + pair.getValue());
//		
//		Rocks rocks = new Rocks();
//		rocks.printSomething(new Dwayne());
//		rocks.printSomething(pair);
//		System.arraycopy(pair, 0, rocks, 0, 0);
		
//		Number num = 12;
//		Integer intType = 3;
//		Double doubleType = 1.2;
//		Float floatType = (float) 0.2;
//		
//		GenericsBoundedTypes<Number> numObj = new GenericsBoundedTypes<>();
////		numObj.getList().add(num);
//		numObj.getList().add(intType);
//		numObj.getList().get(0);
////		numObj.getList().add(doubleType);
////		numObj.getList().add(floatType);
//		
//		numObj.printListValue();
//		System.out.println("Sum: " + numObj.sumAllNumbers());
		List<Manager> list = new ArrayList<>();
		list.add(new Manager());
		list.add(new Manager());
		Company comp = new Company();
		comp.printWorkersUsingUpperBoundary(list);
		
		List<Person> empList = new ArrayList<>();
		empList.add(new Person());
		
		comp.printWorkersUsingLowerBoundary(empList);
		
	}

}
