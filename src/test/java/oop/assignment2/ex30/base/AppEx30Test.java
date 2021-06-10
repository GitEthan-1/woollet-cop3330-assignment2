/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package oop.assignment2.ex30.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppEx30Test {

	@Test
	void tableArray_creates_string_1() {
		// provides 2 x 2 array formatted as a string.
		StringBuilder expected = new StringBuilder();
		expected.append("    1    2\n    2    4\n");
		int[][] arr = {{1,2} , {2,4}};
		StringBuilder actual = AppEx30.createTable(arr);

		assertEquals(0 , expected.compareTo(actual));
	}

	@Test
	void tableArray_creates_string_2() {
		// provides 4 x 4 array formatted as a string.
		StringBuilder expected = new StringBuilder();
		expected.append("    1    2    3    4\n    2    4    6    8\n    3    6    9   12\n    4    8   12   16\n");
		int[][] arr = {{1,2,3,4} , {2,4,6,8} , {3,6,9,12} , {4,8,12,16}};
		StringBuilder actual = AppEx30.createTable(arr);

		assertEquals(0 , expected.compareTo(actual));
	}

	@Test
	void tableArray_creates_string_3() {
		// provides 1 x 1 array formatted as a string.
		StringBuilder expected = new StringBuilder();
		expected.append("    1\n");
		int[][] arr = {{1}};
		StringBuilder actual = AppEx30.createTable(arr);

		assertEquals(0 , expected.compareTo(actual));
	}
}