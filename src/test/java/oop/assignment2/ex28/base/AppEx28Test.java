/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package oop.assignment2.ex28.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppEx28Test {


	@Test
	void sum_1() {
		// 1 + 2 + 3 + 4 + 5 = 15

		int[] arr = {1,2,3,4,5};

		assertEquals(15, AppEx28.sumArray(arr));
	}

	@Test
	void sum_2() {
		// 0 + 0 + 0 + 0 + 0 = 0

		int[] arr = {0,0,0,0,0};

		assertEquals(0, AppEx28.sumArray(arr));
	}

	@Test
	void sum_3() {
		// INTEGER_MAX + INTEGER_MAX + INTEGER_MAX + INTEGER_MAX + INTEGER_MAX = INTEGER_MAX - 4 or (2147483643)

		int[] arr = {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};

		assertEquals(2147483643, AppEx28.sumArray(arr));
	}
}