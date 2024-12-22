package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class mainPane extends JPanel{

	private DefaultTableModel tableModel;
	
	public mainPane() {
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		String[] columnNames = {"Product ID", "Product Name", "Product Qty", "Total Price"};
		
		Font dataFont = new Font("Arial", Font.PLAIN, 15);
		
		String[][] data = {
				{"00001", "All Purpose Cream", "5", String.valueOf(5 * 48)},
				{"00002", "Graham Crackers", "7", String.valueOf(7 * 60)},
				{"00003", "Brown Sugar", "2", String.valueOf(2 * 110)}
		};
		
		tableModel = new DefaultTableModel(columnNames, 0);
		
		final JTable table = new JTable(tableModel);
		table.setRowHeight(35);
		table.setFont(dataFont);
		
		JScrollPane tableContainer = new JScrollPane(table);
		
		tableModel.addRow(new Object[] {"00001", "All Purpose Cream", "5", String.valueOf(5 * 48)});
		tableModel.addRow(new Object[] {"00002", "Graham Crackers", "7", String.valueOf(7 * 60)});
		tableModel.addRow(new Object[] {"00003", "Brown Sugar", "2", String.valueOf(2 * 110)});
		
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		gbc.weighty = 0.33;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		this.add(tableContainer, gbc);
	}
	public void clearData() {
		tableModel.setRowCount(0);
	}
	public DefaultTableModel getTableModel() {
		return tableModel;
	}
}
