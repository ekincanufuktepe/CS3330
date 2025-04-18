package edu.mu.gui;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				SimpleGUIIncrementor guiApp = new SimpleGUIIncrementor();
				guiApp.setVisible(true);
				
			}
		});

	}

}
