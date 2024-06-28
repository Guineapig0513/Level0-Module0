package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		
		String spain = JOptionPane.showInputDialog("What is the capital of Spain?");
		if(spain.equals("Madrid")) {
		JOptionPane.showMessageDialog(null,  "Correct :D");
		score += 1;
		} else {score -= 1;
			JOptionPane.showMessageDialog(null,  "Wrong >:(");}
		
		String cali = JOptionPane.showInputDialog("What is the capital of California?");
		if(cali.equals("Sacramento")) {
		JOptionPane.showMessageDialog(null,  "Correct :D");
		score += 1;
		} else {score -= 1;
			JOptionPane.showMessageDialog(null,  "Wrong >:(");}
		
		String pig = JOptionPane.showInputDialog("Guinea pig is cute?");
		if(pig.equals("Yes")) {
		JOptionPane.showMessageDialog(null,  "Correct :D");
		score += 1;
		}else if(pig.equals("ugly")){
			JOptionPane.showMessageDialog(null,  "You're a Moron -John Martson");
			score -= 1000000000;
		}
		else {score -= 1;
			JOptionPane.showMessageDialog(null,  "Wrong >:(");}
	
		String java = JOptionPane.showInputDialog("True or false? Java was created in 1995?");
		if(java.equals("True")) {
		JOptionPane.showMessageDialog(null,  "Correct :D");
		score += 1;
		} else {score -= 1;
			JOptionPane.showMessageDialog(null,  "Wrong >:(");}
		
		String russia = JOptionPane.showInputDialog("Which country has the biggest territory");
		if(russia.equals("Russia")) {
		JOptionPane.showMessageDialog(null,  "Correct :D");
		score += 1;
		} else {score -= 1;
			JOptionPane.showMessageDialog(null,  "Wrong >:(");}
		
			JOptionPane.showMessageDialog(null, "your score is " +score);
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
