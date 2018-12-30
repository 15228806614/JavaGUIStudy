package com.melody.Testbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUI2 {
	JFrame frame;
	JLabel label;

	void gui () {
		frame = new JFrame();
		JButton KillButton = new JButton("KILL ME");
		frame.getContentPane().add(BorderLayout.WEST, KillButton);
		JButton SaveButton = new JButton("SAVE ME");
		frame.getContentPane().add(BorderLayout.EAST, SaveButton);
		KillButton.addActionListener(new KillButtonListener());
		SaveButton.addActionListener(new SaveButtonListener());
		Drowwer dw = new Drowwer();
		frame.getContentPane().add(BorderLayout.CENTER, dw);
		label = new JLabel("What do you want to choise?");
		frame.getContentPane().add(BorderLayout.NORTH, label);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.setTitle("MELOFY TRY!");;
	}
	class KillButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			frame.repaint();
			label.setText("I die!");
		}

	}
	class SaveButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			frame.repaint();
			label.setText("You have saved me!");
		}

	}


}