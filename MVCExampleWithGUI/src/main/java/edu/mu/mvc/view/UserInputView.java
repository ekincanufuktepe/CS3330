package edu.mu.mvc.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class UserInputView extends JFrame {
	
	private JPanel panel;
	private JTextField userNameTextField;
	private JTextField userAgeTextField;
	private JButton submitUserButton;
	
	public UserInputView() {
		
		setTitle("Submit User Information Page");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		
		panel = new JPanel();
		setContentPane(panel);
		getContentPane().setLayout(null);
		
		userNameTextField = new JTextField();
		userNameTextField.setBounds(229, 93, 96, 20);
		panel.add(userNameTextField);
		userNameTextField.setColumns(10);
		
		userAgeTextField = new JTextField();
		userAgeTextField.setBounds(229, 135, 96, 20);
		panel.add(userAgeTextField);
		userAgeTextField.setColumns(10);
		
		submitUserButton = new JButton("Submit User");
		submitUserButton.setBounds(224, 204, 101, 23);
		panel.add(submitUserButton);
		
		JLabel lblNewLabel = new JLabel("User name:");
		lblNewLabel.setBounds(161, 93, 70, 20);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User age:");
		lblNewLabel_1.setBounds(172, 138, 47, 14);
		panel.add(lblNewLabel_1);
	}
	
	public void addActionListenerToSubmitButton(ActionListener listener) {
		submitUserButton.addActionListener(listener);
	}
	
	public String getUserName() {
		return userNameTextField.getText();
	}
	
	public Integer getUserAge() {
		return Integer.parseInt(userAgeTextField.getText());
	}
}
