package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("What is your Birthday(MM/DD)");
		if (birthday.equals("03/24")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Very Merry Unbirthday!");
		}
	}
}
