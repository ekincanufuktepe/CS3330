package edu.mu.mvc.view;

import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;

import edu.mu.mvc.model.UserInformationModel;

import javax.swing.JList;
import javax.swing.JButton;

public class UserInformationListView extends JFrame {
	
	private JPanel panel;
	private JButton deleteSelectedUsersButton;
	private JList list;
	
	public UserInformationListView() {
		setTitle("User List Information Page");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 100, 500, 400);
		
		panel = new JPanel();
		setContentPane(panel);
		getContentPane().setLayout(null);
	
		DefaultListModel<UserInformationModel> modelList = new DefaultListModel<UserInformationModel>(); 
		list = new JList<UserInformationModel>(modelList);
	
		list.setBounds(68, 85, 390, 174);
		panel.add(list);
		
		deleteSelectedUsersButton = new JButton("Delete Selected Users");
		deleteSelectedUsersButton.setBounds(66, 285, 177, 23);
		panel.add(deleteSelectedUsersButton);
	}
	
	public void addActionListenerToDeleteUserButton(ActionListener listener) {
		deleteSelectedUsersButton.addActionListener(listener);
	}
	
	public DefaultListModel<UserInformationModel> getUserList() {
		return (DefaultListModel<UserInformationModel>) list.getModel();
	}
	
	public int getSelectedUser() {
		System.out.println("Selected user index: " + list.getSelectedIndex());
		return list.getSelectedIndex();
	}
	
	public int[] getMultipleSelectedUser() {
		return list.getSelectedIndices();
	}
	
}
