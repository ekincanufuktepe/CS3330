package edu.mu.maven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		Gson gson = new Gson();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("./files/people.json"));
			String line = br.readLine();
//			System.out.println(line);
//			people = gson.fromJson(line, ArrayList.class);
			Type listType = new TypeToken<ArrayList<Person>>() {}.getType();
			people = gson.fromJson(line, listType);
			System.out.println(people);
			System.out.println(people.get(0).getName());
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
//		Person p = new Person("Ekin", 20, false);
//		Person p1 = new Person("Brandon", 19, true);
//		
//		people.add(p1);
//		people.add(p);
//		
//		String json = gson.toJson(people);
//		
//		System.out.println(json);
//		
//		String json = gson.toJson(p);
//		System.out.println("JSON: " + json);
		
//		try {
//			BufferedWriter bw = new BufferedWriter(new FileWriter("./files/people.json"));
//			bw.write(json);
//			bw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Person p2 = gson.fromJson(json, Person.class);
		
//		System.out.println(p);
//		System.out.println(p2.getName());

	}

}
