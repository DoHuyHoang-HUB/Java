package demo;

import java.awt.Color;

import javax.swing.JFrame;


public class MyFrame extends JFrame {
	
	MyFrame(){
		
		
		this.setTitle("Do huy hoang");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setResizable(false);
		this.setSize(1280, 950);
		this.setVisible(true);
		
		this.getContentPane().setBackground(Color.GRAY);
	}
}
