package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class sideBar extends JPanel {

	private DefaultTableModel tableModel;
	
    public sideBar(mainPane mainPane) {
        this.setPreferredSize(new Dimension(550, 0));
        
        // Use GridBagLayout for dynamic resizing
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Configure common button properties
        Font buttonFont = new Font("Arial", Font.BOLD, 25);
        Dimension buttonDimension = new Dimension(400, 100);

        // Create buttons
        JButton editTransactionButton = new JButton("Edit Transaction");
        JButton cancelTransactionButton = new JButton("Cancel Transaction");
        
        cancelTransactionButton.addActionListener(null);
        
        JButton completeTransactionButton = new JButton("Complete Transaction");

        editTransactionButton.setFont(buttonFont);
        cancelTransactionButton.setFont(buttonFont);
        completeTransactionButton.setFont(buttonFont);
        
        cancelTransactionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call clearData method from mainPane class
                mainPane.clearData();
            }
        });

        // Add buttons with dynamic resizing
        gbc.insets = new Insets(30, 30, 30, 30); // Margins around buttons
        gbc.fill = GridBagConstraints.BOTH; // Allow buttons to resize both horizontally and vertically
        gbc.weightx = 1.0; // Allow horizontal resizing
        gbc.weighty = 0.33; // Divide available vertical space among buttons

        // Edit Transaction button
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(editTransactionButton, gbc);

        // Cancel Transaction button
        gbc.gridy = 1;
        this.add(cancelTransactionButton, gbc);

        // Complete Transaction button
        gbc.gridy = 2;
        this.add(completeTransactionButton, gbc);
    }
}
