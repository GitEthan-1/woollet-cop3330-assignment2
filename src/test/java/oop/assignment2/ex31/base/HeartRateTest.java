/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Woollet
 */
package oop.assignment2.ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateTest {

	@Test
	void karvonenHeartRateRange_1() {
		// age : 22		restingHR : 65
		HeartRate test = new HeartRate();

		int[][] expected = {{55,60,65,70,75,80,85,90,95} , {138,145,151,158,165,171,178,185,191}};
		int[][] actual = test.karvonenHeartRateRange(22,65);

		assertArrayEquals(expected, actual);
	}

	@Test
	void karvonenHeartRateRange_2() {
		// age : 40		restingHR : 55
		HeartRate test = new HeartRate();

		int[][] expected = {{55,60,65,70,75,80,85,90,95} , {124,130,136,143,149,155,161,168,174}};
		int[][] actual = test.karvonenHeartRateRange(40,55);

		assertArrayEquals(expected, actual);
	}

	@Test
	void karvonenRateList_1() {
		HeartRate test = new HeartRate();

		int[][] arr = {{55,60,65,70,75,80,85,90,95} , {138,145,151,158,165,171,178,185,191}};
		String expected = "\nIntensity\t| Rate"+
				"\n------------|--------\n"+
				"55%\t\t\t| 138 bpm\n" +
				"60%\t\t\t| 145 bpm\n" +
				"65%\t\t\t| 151 bpm\n" +
				"70%\t\t\t| 158 bpm\n" +
				"75%\t\t\t| 165 bpm\n" +
				"80%\t\t\t| 171 bpm\n" +
				"85%\t\t\t| 178 bpm\n" +
				"90%\t\t\t| 185 bpm\n" +
				"95%\t\t\t| 191 bpm\n";
		String actual = test.karvonenRateList(arr);

		assertEquals(expected, actual);
	}

	@Test
	void karvonenRateList_2() {
		HeartRate test = new HeartRate();

		int[][] arr = {{55,60,65,70,75,80,85,90,95} , {124,130,136,143,149,155,161,168,174}};
		String expected = "\nIntensity\t| Rate"+
				"\n------------|--------\n"+
				"55%\t\t\t| 124 bpm\n" +
				"60%\t\t\t| 130 bpm\n" +
				"65%\t\t\t| 136 bpm\n" +
				"70%\t\t\t| 143 bpm\n" +
				"75%\t\t\t| 149 bpm\n" +
				"80%\t\t\t| 155 bpm\n" +
				"85%\t\t\t| 161 bpm\n" +
				"90%\t\t\t| 168 bpm\n" +
				"95%\t\t\t| 174 bpm\n";
		String actual = test.karvonenRateList(arr);

		assertEquals(expected, actual);
	}
}