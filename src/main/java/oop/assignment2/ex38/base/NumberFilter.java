/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Woollet
 */
package oop.assignment2.ex38.base;

import java.util.ArrayList;

public class NumberFilter {
	public static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> numbers) {
		ArrayList<Integer> even = new ArrayList<>();

		for (Integer number : numbers) {
			if(number%2 == 0)
				even.add(number);
		}

		return even;
	}

	public static String evenNumbers(ArrayList<Integer> numbers) {
		ArrayList<Integer> even = filterEvenNumbers(numbers);
		StringBuilder output = new StringBuilder();

		for (Integer number : even)
			output.append(number).append(" ");

		return output.toString();
	}
}
