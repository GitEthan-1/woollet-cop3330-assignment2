/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Woollet
 */
package oop.assignment2.ex37.base;

import java.util.Scanner;

/**
 * Exercise 37 - Password Generator
 * Coming up with a password that meets specific requirements is something your computer can do.
 * And it will give you practice using random number generators in conjunction with a list of known values.
 *
 * Create a program that generates a secure password.
 * Prompt the user for the minimum length, the number of special characters, and the number of numbers.
 * Then generate a password for the user using those inputs.
 *
 * Example Output
 *
 * What's the minimum length? 8
 * How many special characters? 2
 * How many numbers? 2
 * Your password is aurn2$1s#
 *
 * Constraints
 *
 * Use lists to store the characters you’ll use to generate the passwords.
 * Ensure that the generated password is random.
 * Ensure that there are at least as many letters are there are special characters and number.
 *
 * Challenges
 *
 * Randomly convert vowels to numbers, such as 3 for E and 4 for A.
 * Have the program present a few options rather than a single result.
 * Place the password on the user’s clipboard when generated.
 */

public class AppEx37 {
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int length = getInt("What's the minimum length? ");
		int special = getInt("How many special characters? ");
		int numbers = getInt("how many numbers? ");


		PasswordGenerator.createPassword(length, numbers, special);
		System.out.println("Your password is " + PasswordGenerator.getPASSWORD());
	}

	public static int getInt(String message) {
		int output;
		while (true) {
			try {
				System.out.print(message);
				output = Integer.parseInt(in.nextLine());
				if(output < 2)
					throw new NumberFormatException();

				return output;
			}
			catch(NumberFormatException ex) {
				System.out.println("Please enter a valid number greater than 3");
			}
		}
	}
}
