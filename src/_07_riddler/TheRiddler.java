package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog("What is greater than God,\r\n" + 
				"more evil than the devil,\r\n" + 
				"the poor have it,\r\n" + 
				"the rich need it,\r\n" + 
				"and if you eat it, you'll die?");
		String answer = "Nothing";
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(riddle.equals(answer)) {
			JOptionPane.showMessageDialog(null,"Correct");
			score++;
			JOptionPane.showMessageDialog(null, "Your score is "+score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect, the answer was "+answer);
			JOptionPane.showMessageDialog(null, "Your score is "+score);
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		String riddle2 = JOptionPane.showInputDialog("Who makes it, has no need of it.\r\n" + 
				"Who buys it, has no use for it. \r\n" + 
				"Who uses it can neither see nor feel it. \r\n" + 
				"What is it?");
		String answer2 = "Coffin";
		if(riddle2.equals(answer2)) {
			JOptionPane.showMessageDialog(null,"Correct");
			score++;
			JOptionPane.showMessageDialog(null, "Your score is "+score);
		}
		else {
			JOptionPane.showMessageDialog(null,"Incorrect, the answer was a "+answer2);
			JOptionPane.showMessageDialog(null,"Your score is "+score);
		}
		String riddle3 = JOptionPane.showInputDialog("You can drop me from the tallest building and I'll be fine,\r\n"+" but if you drop me in water I die. What am I?");
		String answer3 = "Paper";
		if(riddle3.equals(answer3)) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
			JOptionPane.showMessageDialog(null, "Your score is "+score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect, the answer was "+answer3);
			JOptionPane.showMessageDialog(null, "Your score is "+score);
		}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

