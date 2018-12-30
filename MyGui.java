package com.melody.Testbox;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyGui {
	JFrame frame;
	JLabel label;
	void gui() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton colorbutton = new JButton("Kill me");

		colorbutton.addActionListener(new ColorButtonListener());
		frame.getContentPane().add(BorderLayout.SOUTH, colorbutton);
		JButton labelbutton = new JButton("Save me");
		labelbutton.addActionListener(new LabelButtonListener());

		frame.getContentPane().add(BorderLayout.WEST, labelbutton);
		Drowwer dw = new Drowwer();
		label = new JLabel("What do you want to choose");
		frame.getContentPane().add(BorderLayout.CENTER,dw);
		frame.getContentPane().add(BorderLayout.EAST, label);
		frame.setVisible(true);
		frame.setSize(600,600);
	}
	class ColorButtonListener implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
//		JButton melodybutton = new JButton("I die!");
//		frame.add(BorderLayout.NORTH,melodybutton);
//		melodybutton.addActionListener(new MelodyDielistener());
		frame.repaint();
	}	
//	class MelodyDielistener implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent event) {
//			// TODO Auto-generated method stub
//			label.setText("Unbelivable!");
//	
//		}	
//	}
	}

	class LabelButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		label.setText("thats good");

	}
	}	
}


