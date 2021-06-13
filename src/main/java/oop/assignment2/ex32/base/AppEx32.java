/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Woollet
 */
package oop.assignment2.ex32.base;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *Exercise 32 - Guess the Number Game
 * Write a Guess the Number game that has three levels of difficulty.
 * The first level of difficulty would be a number between 1 and 10. The second difficulty set would be between 1 and 100.
 * The third difficulty set would be between 1 and 1000.
 *
 * Prompt for the difficulty level, and then start the game.
 * The computer picks a random number in that range and prompts the player to guess that number.
 * Each time the player guesses, the computer should give the player a hint as to whether the number is too high or too low.
 * The computer should also keep track of the number of guesses. Once the player guesses the correct number,
 * the computer should present the number of guesses and ask if the player would like to play again.
 *
 * Example Output
 *
 * Let's play Guess the Number!
 *
 * Enter the difficulty level (1, 2, or 3): 1
 * I have my number. What's your guess? 5
 * Too low. Guess again: 7
 * Too low. Guess again: 9
 * You got it in 3 guesses!
 *
 * Do you wish to play again (Y/N)? y
 *
 * Enter the difficulty level (1, 2, or 3): 3
 * I have my number. What's your guess? 500
 * Too low. Guess again: 750
 * Too high. Guess again: 600
 * Too low. Guess again: 700
 * Too low. Guess again: 725
 * Too high. Guess again: 715
 * Too high. Guess again: 710
 * Too high. Guess again: 705
 * Too high. Guess again: 701
 * Too low. Guess again: 702
 * You got it in 10 guesses!
 *
 * Do you wish to play again (Y/N)? n
 *
 * Constraints
 *
 * Don’t allow any non-numeric data entry.
 * During the game, count non-numeric entries as wrong guesses.
 *
 * Challenges
 *
 * Map the number of guesses taken to comments:
 * 1 guess: “You’re a mind reader!”
 * 2–4 guesses: “Most impressive.”
 * 3–6 guesses: “You can do better than that.”
 * 7 or more guesses: “Better luck next time.”
 * Keep track of previous guesses and issue an alert that the user has already guessed that number. Count this as a wrong guess.
 * Implement this as a graphical game with a grid of numbers. When a number is clicked or tapped, remove the number from the screen.
 */

public class AppEx32 {
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Lets play Guess the Number!\n");

		NumberGame game = new NumberGame();
		while(true) {
			game.setRandomNum(getdifficulty());
			//System.out.println(game.RANDOM_NUM);

			String message = "";
			while (!message.contains("You got it")) {
				if (game.GUESSES == 0)
					message = game.guess(getInt("I have my number. What's your guess? "));
				else
					message = game.guess(getInt(message));
			}
			System.out.print(message);

			in.nextLine();
			if(!getYesOrNo())
				break;

		}


	}

	private static int getdifficulty() {
		System.out.print("Enter the difficulty level (1, 2, or 3): ");
		while(true) {
			try{
				int num = in.nextInt();
				return switch(num) {
					case 1,2,3 :
						yield num;
					default:
						throw new NumberFormatException();
				};
			}
			catch(NumberFormatException | InputMismatchException nfe) {
				System.out.println("Please enter a valid number");
			}
		}
	}

	private static int getInt(String message) {
		try{
			System.out.print(message);
			int num = in.nextInt();
			if(num < 1)
				throw new NumberFormatException();

			return num;
		}
		catch(NumberFormatException | InputMismatchException ime) {
			return 0;
		}
	}

	private static boolean getYesOrNo() {
		System.out.print("Do you wish to play again (Y/N)? ");
		String answer = (in.nextLine());
		answer.toLowerCase(Locale.ROOT);
		if(answer.charAt(0) == 'y')
			return true;

		return false;

	}
}
