package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class navPane extends JPanel{

	public navPane() {;
		this.setPreferredSize(new Dimension(0, 100));
		
		this.setLayout(new BorderLayout());
		
		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT, 0, 0);
		
		JPanel toolBarSection = new JPanel(flowLayout);
		toolBarSection.setPreferredSize(new Dimension(0, 30));
		
		JButton transactionHistoryButton = new JButton("Transaction History");
		JButton settingsButton = new JButton("Settings");
		JButton aboutButton = new JButton("About");
		JButton helpButton = new JButton("Help");
		
		toolBarSection.add(transactionHistoryButton);
		toolBarSection.add(settingsButton);
		toolBarSection.add(aboutButton);
		toolBarSection.add(helpButton);
		
		JPanel titleSection = new JPanel();
		titleSection.setPreferredSize(new Dimension(0, 70));
		
		JLabel label1 = new JLabel("A new TItle");
		
		Font titleFont = new Font("Times New Roman", Font.PLAIN, 30);
		
		label1.setFont(titleFont);
		
		titleSection.add(label1);
		
		add(toolBarSection, BorderLayout.NORTH);
		add(titleSection, BorderLayout.SOUTH);
	}
	
}
