package edu.mu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Welcome to CS3330");
		int x = 5;
		int y = 2;
		System.out.println("Some string " + (x + y));
		System.out.println((double)x/y);
		
//		System.out.println(x+=2);
//		System.out.println(x);
//		String firstname = "Ekincan";
//		System.out.println("Length of firstname: " + firstname.length());
	
//		Scanner input = new Scanner(System.in);
//		int age = input.nextInt();
//		String firstname = input.next();
//		String lastname = input.next();
//		input.nextLine();
//		String bio = input.nextLine();
//		
//		System.out.println("Firstname: " + firstname + " Lastname: " + lastname + " Age: " + age);
//		System.out.println("Bio: " + bio);
		
		// Input source from a file
		Scanner fileInput = null;
		try {
			fileInput = new Scanner(new FileInputStream("./files/secret.txt"));
//			System.out.println(fileInput.next());
//			System.out.println(fileInput.next());
//			System.out.println(fileInput.nextLine());
//			while(fileInput.hasNext()) {
			while(fileInput.hasNextLine()) {
				System.out.println(fileInput.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
