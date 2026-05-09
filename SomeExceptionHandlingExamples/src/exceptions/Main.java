package exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("./files/notes.txt"));
			int a = 5;
			bw.write(a);
			int b = 0;
			int c = a/b;
			System.out.println("Result: " + c);
		}
		catch(ArithmeticException | IOException e) {
			System.out.println("here is the message: " + e.getMessage());
			System.out.println("Stack trace: " + e.getStackTrace()[0]);
		} 
		catch(Exception e) {
			System.out.println("This is the Exception catch block");
		}
		finally {
			System.out.println("This will always run");
		}
		
		System.out.println("This is the finally block!");
		if(bw !=null) {
			try {
				System.out.println("Closing file");
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Let's see if you can print this");

	}

}
