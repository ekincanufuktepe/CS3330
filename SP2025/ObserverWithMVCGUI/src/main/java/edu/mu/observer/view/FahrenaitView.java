package edu.mu.observer.view;

import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentListener;

import edu.mu.observer.model.ITempratureUnit;

public class FahrenaitView extends JFrame implements Observer {
	
	private JPanel panel;
	private JTextField textField;
	
	public FahrenaitView() {
		setTitle("Fahrenait Page");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600, 300, 200, 200);
		
		panel = new JPanel();
		setContentPane(panel);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(42, 72, 96, 20);
		panel.add(textField);
		textField.setColumns(10);
	}

	@Override
	public void update(Observable o, Object arg) {
		Double temp = ((ITempratureUnit)o).toFahrenait().getTemprature();
		textField.setText(temp.toString());
	}
	
}
