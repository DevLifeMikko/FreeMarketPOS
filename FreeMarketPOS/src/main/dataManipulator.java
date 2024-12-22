package main;

public class dataManipulator {
	private mainPane mainPane;
	
	public dataManipulator(mainPane mainPane) {
		this.mainPane = mainPane;
	}
	public void triggerClearData() {
		mainPane.clearData();
	}
}
