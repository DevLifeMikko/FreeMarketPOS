package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame{
	
	public Main() {
		setTitle("Free Market POS Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(1000, 600);
		
		setMinimumSize(new Dimension(1000, 600));
		
		setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH); //start on maximized
		
		setLayout(new BorderLayout());
		
		navPane navPane = new navPane(); //navigation panel on the top
		
		mainPane mainPane = new mainPane();
		
		sideBar sideBar = new sideBar(mainPane);
		
		statusPane statusPane = new statusPane();
		
		add(navPane, BorderLayout.NORTH);
		add(mainPane, BorderLayout.CENTER);
		add(sideBar, BorderLayout.WEST);
		add(statusPane, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(Main::new);
	}

}
