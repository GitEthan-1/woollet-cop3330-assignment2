/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package oop.assignment2.ex32.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberGameTest {

	@Test
	void guess_low() {
		// test to see if the proper string is returned
		NumberGame test = new NumberGame();
		test.setRandomNum(3);
		String expected = "Too low. Guess again: " ;
		String actual = test.guess(test.RANDOM_NUM - 1);

		assertEquals(expected , actual);
	}

	@Test
	void guess_high() {
		// test to see if the proper string is returned
		NumberGame test = new NumberGame();
		test.setRandomNum(3);
		String expected = "Too high. Guess again: " ;
		String actual = test.guess(test.RANDOM_NUM + 1);

		assertEquals(expected , actual);
	}

	@Test
	void guess_correct() {
		// test to see if the proper string is returned
		NumberGame test = new NumberGame();
		test.setRandomNum(3);
		String actual = test.guess(test.RANDOM_NUM);
		String expected = "You got it in 1 guesses!\n\n" ;

		assertEquals(expected , actual);
	}

	@Test
	void setRandomNum_level_1() {
		// see if the numbers generated are between 1 and 10
		NumberGame test = new NumberGame();
		test.setRandomNum(1);
		//System.out.println(test.RANDOM_NUM);
		boolean expected = true;
		boolean actual = (test.RANDOM_NUM > 0 && test.RANDOM_NUM < 11);

		assertEquals(expected , actual);
	}

	@Test
	void setRandomNum_level_2() {
		// see if the numbers generated are between 1 and 100
		NumberGame test = new NumberGame();
		test.setRandomNum(2);
		//System.out.println(test.RANDOM_NUM);
		boolean expected = true;
		boolean actual = (test.RANDOM_NUM > 0 && test.RANDOM_NUM < 101);

		assertEquals(expected , actual);
	}

	@Test
	void setRandomNum_level_3() {
		// see if the numbers generated are between 1 and 1000
		NumberGame test = new NumberGame();
		test.setRandomNum(3);
		//System.out.println(test.RANDOM_NUM);
		boolean expected = true;
		boolean actual = (test.RANDOM_NUM > 0 && test.RANDOM_NUM < 1001);

		assertEquals(expected , actual);
	}
}