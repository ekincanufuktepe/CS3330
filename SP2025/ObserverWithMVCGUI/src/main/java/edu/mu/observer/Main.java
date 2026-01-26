package edu.mu.observer;

import javax.swing.SwingUtilities;

import edu.mu.observer.controller.TempratureController;

public class Main {

	public static void main(String[] args) {
		TempratureController tc = new TempratureController();
		tc.start();
	}

}
