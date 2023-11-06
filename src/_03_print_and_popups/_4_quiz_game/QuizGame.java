package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String Answer = JOptionPane.showInputDialog("What is 1+1?");
		if (Answer.equals("2")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong, the answer is 2.");
		score--;
		}
		String answer = JOptionPane.showInputDialog("What is 2+2?");
				// 2.  Ask the user a question 
		if (answer.equals("4")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
				// 3.  Use an if statement to check if their answer is correct
		else { 
			JOptionPane.showMessageDialog(null, "Wrong, the answer is 4.");
			score--;
		}
				// 4.  if the user's answer was correct, add one to their score 
		String aNswer = JOptionPane.showInputDialog("What is 3+3?");
		if (aNswer.equals("6")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score ++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong, the answer is 6.");
		score--;
		}
		String anSwer = JOptionPane.showInputDialog("What is 4+4?");
		// 2.  Ask the user a question 
		if (anSwer.equals("8")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		// 3.  Use an if statement to check if their answer is correct
		else { 
			JOptionPane.showMessageDialog(null, "Wrong, the answer is 8.");
			score--;
		}
JOptionPane.showMessageDialog(null, "Your score is: " + score);
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
