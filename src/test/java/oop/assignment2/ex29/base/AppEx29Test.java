/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package oop.assignment2.ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppEx29Test {

	@Test
	void getYears_1() {
		// 72 / 4 = 18

		String expected = "It will take 18 years to double your initial investment." ;
		String actual = AppEx29.getYears(4);
		assertEquals(expected , actual);
	}

	@Test
	void getYears_2() {
		// 72 / 12 = 6

		String expected = "It will take 6 years to double your initial investment." ;
		String actual = AppEx29.getYears(12);
		assertEquals(expected , actual);
	}

	@Test
	void getYears_3() {
		// 72 / 6.5 = 12

		String expected = "It will take 12 years to double your initial investment." ;
		String actual = AppEx29.getYears(6.5);
		assertEquals(expected , actual);
	}

	@Test
	void getYears_4() {
		// 72 / 0.08 = 900

		String expected = "It will take 900 years to double your initial investment." ;
		String actual = AppEx29.getYears(0.08);
		assertEquals(expected , actual);
	}
}