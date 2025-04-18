package generics.boundedtypes;

import java.util.ArrayList;
import java.util.List;

public class GenericsBoundedTypes <T extends Number> {
	
	private List<T> list;
	
	public GenericsBoundedTypes() {
		setList(new ArrayList<>());
	}
	
	public void printListValue() {
		for(T number : list) {
			System.out.println(number);
		}
	}
	
	public Double sumAllNumbers() {
		Double sum = 0.0;
		for(T number : list) {
//			sum = Double.sum(sum, number.doubleValue());
			sum += number.doubleValue();
		}
		return sum;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}	

}
