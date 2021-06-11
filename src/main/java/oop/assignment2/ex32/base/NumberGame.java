/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package oop.assignment2.ex32.base;

import java.util.InputMismatchException;

public class NumberGame {
	public int RANDOM_NUM = 0;
	public int GUESSES = 0;

	public String guess(int guess) {
		GUESSES++;
		String output = "";
		try {
			if(guess == RANDOM_NUM) {
				output = "You got it in " + GUESSES + " guesses!\n\n" ;
				GUESSES =0;
			}
			else if(guess > RANDOM_NUM) {
				output = "Too high. Guess again: " ;
			}
			else if(guess < RANDOM_NUM) {
				output = "Too low. Guess again: " ;
			}
		}
		catch (InputMismatchException ime){
			output += "Guess again: " ;
		}
		return output;
	}


	public void setRandomNum(int difficulty) {
		RANDOM_NUM = 1 + (int)(Math.random() * Math.pow(10,difficulty));
	}
}
