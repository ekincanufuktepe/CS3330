package edu.mu.cs3330.sigleton;

import edu.mu.cs3330.sigleton.logger.SingletonLogger;

public class Main {

	public static void main(String[] args) {
		SingletonLogger.getInstance().logText("Hello there!");
		SingletonLogger sl = SingletonLogger.getInstance();
		sl.logText("Hahaha");
	}

}
