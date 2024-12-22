package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class statusPane extends JPanel{

	public statusPane() {
		this.setPreferredSize(new Dimension(0, 30));
		
		FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);
		this.setLayout(flowLayout);
		
		Font font = new Font("Arial", Font.ITALIC, 15);
		
		JLabel versionLabel = new JLabel("Version 1.0 by DevLifeMikko");
		versionLabel.setFont(font);
		
		this.add(versionLabel);
	}
}
