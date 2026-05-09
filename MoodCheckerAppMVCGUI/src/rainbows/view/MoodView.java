package rainbows.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MoodView extends JFrame {
	
	private JComboBox<String> moodBox;
	private JButton showButton;
	private JPanel colorPanel;
	private JLabel messageLabel;
	
	public MoodView() {
		
		setTitle("Mood Color Checker");
		setSize(420, 260);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		moodBox = new JComboBox<>(new String[] {
				"Calm", "Energetic", "Focused", "Happy"
		});
		
		showButton = new JButton("Show Mood");
		colorPanel = new JPanel();
		colorPanel.setBackground(Color.LIGHT_GRAY);
		colorPanel.setPreferredSize(new Dimension(300, 80));
		
		messageLabel = new JLabel("Choose a mood to begin", SwingConstants.CENTER);
		
		JPanel inputPanel = new JPanel();
		inputPanel.add(new JLabel("Mood"));
		inputPanel.add(moodBox);
		inputPanel.add(showButton);
		
		JPanel centerPanel = new JPanel();
		centerPanel.add(colorPanel);
		setLayout(new BorderLayout(10, 10));
		add(inputPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(messageLabel, BorderLayout.SOUTH);
	}
	
	public String getSelectedMood() {
		return (String) moodBox.getSelectedItem();
	}
	
	public void setMoodColor(Color color) {
		colorPanel.setBackground(color);
	}
	
	public void setMessage(String message) {
		messageLabel.setText(message);
	}
	
	public void addNewMoodListener(ActionListener listener) {
		showButton.addActionListener(listener);
	}

}
