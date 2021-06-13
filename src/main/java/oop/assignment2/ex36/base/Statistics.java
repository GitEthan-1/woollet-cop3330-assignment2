/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Woollet
 */
package oop.assignment2.ex36.base;

import java.util.ArrayList;

public class Statistics {

	public String stringList(ArrayList<Integer> numbers) {
		StringBuilder output = new StringBuilder("Numbers: ");
		for (Integer value : numbers)
			output.append(" ").append(value).append(",");
		output.deleteCharAt(output.lastIndexOf(","));
		return output.toString();
	}

	public int sum(ArrayList<Integer> numbers) {
		int sum = 0;
		for (Integer value : numbers)
			sum += value;

		return sum;
	}

	public double average (ArrayList<Integer> numbers) {
		return 1.0 * sum(numbers) / numbers.size();
	}

	public int max(ArrayList<Integer> numbers) {
		int max = numbers.get(0);
		for (Integer value : numbers) {
			max = ( max < value ? value : max );
		}
		return max;
	}

	public int min(ArrayList<Integer> numbers) {
		int min = numbers.get(0);
		for (Integer value : numbers) {
			min = ( min > value ? value : min );
		}
		return min;
	}

	public double std(ArrayList<Integer> numbers) {
		double avg = average(numbers);
		double numerator = 0;
		for (Integer x : numbers) {
			numerator += Math.pow((x - avg) , 2);
		}
		return Math.round(Math.sqrt( numerator / numbers.size()) * 100) / 100.0;
	}

	public String fullReport(ArrayList<Integer> numbers) {
		return stringList(numbers) + "\n" +
				"The average is " + String.format("%.1f",average(numbers)) + "\n" +
				"The minimum is " + min(numbers) + "\n" +
				"The maximum is " + max(numbers) + "\n" +
				"The standard deviation is " + String.format("%.2f" , std(numbers));
	}
}
