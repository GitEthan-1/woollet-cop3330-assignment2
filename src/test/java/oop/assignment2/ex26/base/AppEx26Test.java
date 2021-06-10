/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package oop.assignment2.ex26.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppEx26Test {

	@Test
	void calculate_returns_correct_months_1() {
		// with  balance: 2000 apr: 18% payment: 35 calculate() should return 131 months
		int expected = 129;
		int actual = AppEx27.calculate(2000,18,35);

		assertEquals(expected , actual);
	}

	@Test
	void calculate_returns_correct_months_2() {
		// with  balance: 5000 apr: 12% payment: 100 calculate() should return 70 months
		int expected = 70;
		int actual = AppEx27.calculate(5000, 12, 100);

		assertEquals(expected , actual);
	}

	@Test
	void calculate_returns_correct_months_3() {
		// with  balance: 10000 apr: 50 payment: 500 calculate() should return 45 months
		int expected = 45;
		int actual = AppEx27.calculate(10000,50,500);

		assertEquals(expected , actual);
	}

	@Test
	void calculate_returns_correct_months_4() {
		// with  balance: 1234 apr: 12.3456 payment: 123 calculate() should return 11 months
		int expected = 11;
		int actual = AppEx27.calculate(1234,12.3456,123);

		assertEquals(expected , actual);
	}

	@Test
	void calculate_returns_correct_months_5() {
		// with  balance: 1000 apr: 10 payment: 10 calculate() should return _ months
		int expected = 213;
		int actual = AppEx27.calculate(1000,10 ,10);

		assertEquals(expected , actual);
	}
}