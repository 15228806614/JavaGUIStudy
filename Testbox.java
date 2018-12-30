package com.melody.Testbox;
import javax.swing.*;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.*;

public class Testbox extends JPanel implements ActionListener  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button;
	JFrame frame;
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		JFrame frame = new JFrame();
//		JButton button = new JButton("kiss me");
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().add(button);
//		button.setText("You have kissed me");
//		frame.setSize(300, 300);
//		frame.setVisible(true);
		MyGui gui = new MyGui();
		gui.gui();
	}
	public void paintComponent(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(20,50,100,100);
	}
	public void go () {
		JFrame frame = new JFrame();
		button = new JButton("kiss me");
		button.addActionListener(this);
		Drowwer drawPane = new Drowwer();
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		button.setText("You have kissed me!");
		frame.repaint();
		
	}


}
