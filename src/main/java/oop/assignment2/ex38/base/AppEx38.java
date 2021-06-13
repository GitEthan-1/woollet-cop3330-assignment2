/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Woollet
 */
package oop.assignment2.ex38.base;

import java.util.*;

/**
 * Exercise 38 - Filtering Values
 * Sometimes input you collect will need to be filtered down. Data structures and loops can make this process easier.
 *
 * Create a program that prompts for a list of numbers, separated by spaces. Have the program print out a new list containing only the even numbers.
 *
 * Example Output
 *
 * Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
 * The even numbers are 2 4 6 8.
 *
 * Constraints
 *
 * Convert the input to an array. Many languages can easily convert strings to arrays with a built-in function that splits apart a string based on a specified delimiter.
 * Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
 * Use a function called filterEvenNumbers to encapsulate the logic for this. The function takes in the old array and returns the new array.
 *
 * Challenge
 *
 * Instead of prompting for numbers, read in lines from any text file and print out only the even-numbered lines.
 */

public class AppEx38 {
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter a list of numbers, separated by spaces: ");
		String evenList = NumberFilter.evenNumbers(getIntArray());
		System.out.println("The even numbers are " + evenList);
	}

	public static ArrayList<Integer> getIntArray() {
		String[] input= in.nextLine().split(" ");

		ArrayList<Integer> intList = new ArrayList<>();

		for (String number : input) {
			try{
				intList.add(Integer.parseInt(number));
			}
			catch(NumberFormatException ignore) {
			}
		}
		return intList;
	}
}
