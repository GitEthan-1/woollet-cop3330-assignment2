/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Woollet
 */
package oop.assignment2.ex28.base;

import java.util.Scanner;

/**
 *Exercise 28 - Adding Numbers
 * In previous programs, you asked the user for repeated input by writing the input statements multiple times.
 * But it’s more efficient to use loops to deal with repeated input.
 *
 * Write a program that prompts the user for five numbers and computes the total of the numbers.
 *
 * Example Output
 *
 * Enter a number: 1
 * Enter a number: 2
 * Enter a number: 3
 * Enter a number: 4
 * Enter a number: 5
 * The total is 15.
 *
 * Constraints
 *
 * The prompting must use repetition, such as a counted loop, not three separate prompts.
 * Create a flowchart before writing the program.
 *
 * Challenges
 *
 * Modify the program to prompt for how many numbers to add, instead of hard-coding the value.
 * Be sure you convert the input to a number before doing the comparison.
 * Modify the program so that it only adds numbers and silently rejects non-numeric values. Count these invalid entries as attempts anyway.
 * In other words, if the number of numbers to add is 5, your program should still prompt only five times.
 */

public class AppEx28 {
	public static final Scanner in = new Scanner(System.in);

	// how many numbers are being read from the user
	public static final int NUM = 5;

	public static void main(String[] args) {
		int total = sumArray(get5());
		System.out.println("The total is " + total + ".");

	}

	public static int sumArray(int arr[]) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
	}

	public static int[] get5() {
		int[] inputArr = new int[NUM];
		for (int i = 0; i < NUM; i++) {
			inputArr[i]= getInt("Enter a number: ");
		}
		return inputArr;
	}

	public static int getInt(String message) {
		while (true) {
			try {
				System.out.print(message);
				return Integer.parseInt(in.nextLine());
			}
			catch (NumberFormatException nfe) {
			}
		}
	}
}
