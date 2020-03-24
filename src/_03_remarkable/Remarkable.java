package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
			String name = JOptionPane.showInputDialog("What is your name?");
		// 1. Save something remarkable about each person in a variable.
			if (name.equals("Joe")) {
				JOptionPane.showMessageDialog(null, "Joe you're very cool.");
			}
			if (name.equals("Bob")) {
				JOptionPane.showMessageDialog(null, "Bob you're very smart.");
			}
			if (name.equals("Joey")) {
				JOptionPane.showMessageDialog(null, "Joey you're very handsome.");
			}
			if (name.equals("Bobby")) {	
				JOptionPane.showMessageDialog(null, "Bobby you're very intelligent.");
			}


		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

