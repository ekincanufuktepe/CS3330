package edu.mu.cs3330.sigleton.logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SingletonLogger {
	
	private static SingletonLogger instance = null;
	private static final String filePath = "./files/log.txt";
	
	private SingletonLogger() {
		
	}
	
	public static SingletonLogger getInstance() {
		if(instance == null) 
			instance = new SingletonLogger();
		return instance;
	}
	
	public void logText(String text) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(filePath));
			bw.write(text);
			bw.close();
			System.out.println("Log successful!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
