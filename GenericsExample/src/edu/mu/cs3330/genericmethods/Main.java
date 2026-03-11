package edu.mu.cs3330.genericmethods;

public class Main {

	public static void main(String[] args) {
		Printer.print("Hello" + 123);
		Printer.print(123);
		Printer.print((new Task("Sleep")) + "Bye");
	}

}
