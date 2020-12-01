package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score=0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String answer = JOptionPane.showInputDialog("how fast do cheetahs run?");
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				if(answer.equalsIgnoreCase("15 mph")) {
				score=score+1;	
				}
				// 4.  if the user's answer was correct, add one to their score 
				answer = JOptionPane.showInputDialog("What is my favorite animal?");
				if(answer.equalsIgnoreCase("cats")) {
					score=score+1;
				}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
