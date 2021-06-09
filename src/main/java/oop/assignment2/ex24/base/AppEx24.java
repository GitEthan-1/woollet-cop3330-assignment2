/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package oop.assignment2.ex24.base;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Exercise 24 - Anagram Checker
 * Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.
 *
 * Create a program that compares two strings and determines if the two strings are anagrams.
 * The program should prompt for both input strings and display the output as shown in the example that follows.
 *
 * Example Output
 *
 * Enter two strings and I'll tell you if they are anagrams:
 * Enter the first string: note
 * Enter the second string: tone
 * "note" and "tone" are anagrams.
 *
 * Constraints
 *
 * Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or false.
 * Invoke this function from your main program.
 * Check that both words are the same length.
 *
 * Challenge
 *
 * Complete this program without using built-in language features. Use selection or repetition logic instead and develop your own algorithm.
 */

public class AppEx24 {
	
	public static final	Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter 2 strings and I'll tell you if they are anagrams:");
		
		String s1 = getString("Enter the first string: ");
		String s2 = getString("Enter the second string: ");
		
		AnagramDetector anagram = new AnagramDetector();
		boolean isAnagram = anagram.isAnagram(s1, s2);
		
		output(s1, s2 , isAnagram);
	}
	
	
	public static String getString(String message) {
		System.out.print(message);
		return in.nextLine();
	}
	
	
	public static void output(String s1, String s2, boolean x) {
		System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are" + (x ? "" : " not") + " anagrams.");
	}
	
}
