/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package oop.assignment2.ex31.base;

public class HeartRate {

	public int[][] karvonenHeartRateRange(int age, int resting) {
		int[][] arr= new int[2][9];

		for (int i = 0; i < arr[0].length; i++) {
			arr[0][i] = 55 + (i*5);
			arr[1][i] = (int)Math.round(((220 - age - resting) * (arr[0][i])/100.0) + resting) ;
		}
		return arr;
	}

	public String karvonenRateList(int[][] arr) {
		String output = "\nIntensity\t| Rate\n------------|--------\n";
		for (int i = 0; i < arr[0].length; i++) {
			output += arr[0][i] + "%\t\t\t| " + arr[1][i] + " bpm\n";
		}
		return output;
	}
}
