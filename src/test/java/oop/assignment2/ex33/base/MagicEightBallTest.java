/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package oop.assignment2.ex33.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicEightBallTest {

	@Test
	void response_string_returned_within_bounds() {
		MagicEightBall test = new MagicEightBall();
		String actual = test.response();
		String expected = test.RESPONSES_LIST[test.NEXT_RESPONSE];
		System.out.println(actual);
		assertEquals(expected , actual);
	}

	@Test
	void response_random_numbers_within_bounds() {
		// check 100 response values to see if they are within 0-19
		boolean expected = true;
		boolean actual = true;
		MagicEightBall test = new MagicEightBall();
		for (int i = 0; i < 100; i++) {
			test.response();
			if(!(test.NEXT_RESPONSE >=0 && test.NEXT_RESPONSE < 20))
				actual = false ;
		}

		assertEquals(expected , actual);
	}
}