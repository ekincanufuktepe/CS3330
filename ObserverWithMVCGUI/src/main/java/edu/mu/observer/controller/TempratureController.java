package edu.mu.observer.controller;

import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import edu.mu.observer.model.CelsiusModel;
import edu.mu.observer.model.FahrenaitModel;
import edu.mu.observer.view.CelsiusView;
import edu.mu.observer.view.FahrenaitView;
import edu.mu.observer.view.TempratureInputView;

public class TempratureController {
	
	private TempratureInputView inputView = null;
	private CelsiusView cView = null;
	private FahrenaitView fView = null;
	private CelsiusModel cModel = null;
	private FahrenaitModel fModel = null;
	
	public TempratureController() {
		inputView = new TempratureInputView();
		cModel = new CelsiusModel();
		fModel = new FahrenaitModel();
		fView = new FahrenaitView();
		cView = new CelsiusView();
		cModel.addObserver(cView);
		cModel.addObserver(fView);
		inputView.addTextFieldListener(new TextFieldDocumentListener());
		
	}
	
	public void start() {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				cView.setVisible(true);
				fView.setVisible(true);
				inputView.setVisible(true);
			}
		});
		
	}
	
	private class TextFieldDocumentListener implements DocumentListener {

		@Override
		public void insertUpdate(DocumentEvent e) {
			Double temp = inputView.getTemprature();
			cModel.setTemprature(temp);
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			Double temp = inputView.getTemprature();
			cModel.setTemprature(temp);
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
