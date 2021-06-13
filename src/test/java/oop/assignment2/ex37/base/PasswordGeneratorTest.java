/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Woollet
 */
package oop.assignment2.ex37.base;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

	@Test
	void createPassword_1() {
		// tests the ratio of letters to characters and special symbols 10 times
		for (int r = 0; r < 10; r++) {
			PasswordGenerator.createPassword(16,4,4);
			char[] passwordArray = PasswordGenerator.getPASSWORD().toLowerCase(Locale.ROOT).toCharArray();

			int letter=0;
			int number=0;
			int special=0;

			for (int i = 0; i < passwordArray.length; i++) {
				if(passwordArray[i] <= 122 && passwordArray[i] >= 97)
					letter++;
				else if(passwordArray[i] <= 57 && passwordArray[i] <= 48)
					number++;
				else
					special++;
			}

			boolean expected = true;
			boolean actual = letter >= (special + number);

			assertEquals(expected , actual);
		}
	}


	@Test
	void findLetters_1() {
		// checks to be sure that letters are a least half of the password
		int expected = 8;
		int actual = PasswordGenerator.findLetters(16,4,4);

		assertEquals(expected , actual);
	}

	@Test
	void findLetters_2() {
		// checks to be sure that letters are a least half of the password
		int expected = 9;
		int actual = PasswordGenerator.findLetters(13,3,5);

		assertEquals(expected , actual);
	}

	@Test
	void findLetters_3() {
		// checks to be sure that letters are a least half of the password
		int expected = 14;
		int actual = PasswordGenerator.findLetters(22,10,3);

		assertEquals(expected , actual);
	}
}