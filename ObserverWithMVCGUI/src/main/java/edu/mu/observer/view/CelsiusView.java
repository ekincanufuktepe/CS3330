package edu.mu.observer.view;

import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentListener;

import edu.mu.observer.model.CelsiusModel;
import edu.mu.observer.model.ITempratureUnit;

public class CelsiusView extends JFrame implements Observer {
	
	private JPanel panel;
	private JTextField textField;
	
	public CelsiusView() {
		setTitle("Celsius Page");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600, 100, 200, 200);
		
		panel = new JPanel();
		setContentPane(panel);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(51, 67, 96, 20);
		panel.add(textField);
		textField.setColumns(10);
	}

	@Override
	public void update(Observable o, Object arg) {
		// violates the 'L' principle (Liskov's Substitution)
//		if(o instanceof CelsiusModel) {
//			CelsiusModel cModel = (CelsiusModel)o;
//			Double temp = cModel.getTemprature();
//			textField.setText(temp.toString());
//		}
		
		Double temp = ((ITempratureUnit)o).toCelsius().getTemprature();
		textField.setText(temp.toString());
	}

}
