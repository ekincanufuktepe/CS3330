package edu.mu.loggingapp.logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerSingleton {

	private static LoggerSingleton instance;
	private static final String filename = "./files/log.txt";
	
	// prevent from being invoked outside
	private LoggerSingleton() {
		
	}
	
	public static LoggerSingleton getInstance() {
		if(instance == null) {
			instance = new LoggerSingleton();
		}
		return instance;
	}
	
	public void logUser(String message) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(filename, true));
			String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			bw.write("["+ timestamp + "] " + message + "\n");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
