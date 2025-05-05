package edu.mu.observer.view;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentListener;

public class TempratureInputView extends JFrame {
	
	private JPanel panel;
	private JTextField textField;
	
	public TempratureInputView() {
		setTitle("Temprature Input Page");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		
		panel = new JPanel();
		setContentPane(panel);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Temprature in Celsius:");
		lblNewLabel.setBounds(110, 156, 162, 33);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(275, 162, 96, 20);
		panel.add(textField);
		textField.setColumns(10);
	}
	
	public Double getTemprature() {
		if(!textField.getText().matches("^-?[0-9]+.?[0-9]*$")) {
			System.out.println("Invalid input");
			return 0.0;
		}
		return Double.parseDouble(textField.getText());
	}
	
	public void addTextFieldListener(DocumentListener listener) {
		textField.getDocument().addDocumentListener(listener);
	}
	
}
