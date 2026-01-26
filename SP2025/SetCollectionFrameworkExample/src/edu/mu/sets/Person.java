package edu.mu.sets;

import java.util.Objects;

public class Person {
	
	private String name;
	private Integer age;
	
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
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
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		if(name.equals(p.getName()) && age.intValue() == p.getAge().intValue()) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	

}
