package edu.mu.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleGUIIncrementor extends JFrame {
	
	private JPanel contentPane;
	
	public SimpleGUIIncrementor() {
		
		setTitle("My first GUI App");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("0");
		textPane.setBounds(291, 159, 83, 20);
		contentPane.add(textPane);
		
		JSlider slider = new JSlider();
		slider.setValue(0);
		slider.setBounds(81, 153, 200, 26);
		contentPane.add(slider);
		
		JButton btnNewButton = new JButton("Increment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(291, 188, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton2 = new JButton("Deccrement");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton2.setBounds(291, 220, 89, 23);
		contentPane.add(btnNewButton2);
		
		btnNewButton.addActionListener(null);
		
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				Integer val = slider.getValue();
				textPane.setText(val.toString());
			}
		});
		
	}
}
