/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package oop.assignment2.ex25.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthTest {

	//--------------------TESTING SCORING--------------------//
	@Test
	void score_of_short_num_only_pass_1() {
		// "12345" should be rated a 0
		PasswordStrength pass = new PasswordStrength();

		int expected = 0;
		int actual =  pass.score("01234");

		assertEquals(expected , actual);
	}

	@Test
	void score_of_short_num_only_pass_2() {
		// "98765" should be rated a 0
		PasswordStrength pass = new PasswordStrength();

		int expected = 0;
		int actual =  pass.score("98765");

		assertEquals(expected , actual);
	}

	@Test
	void score_of_long_num_only_pass_1() {
		// "0123456789" should be rated a 3
		PasswordStrength pass = new PasswordStrength();

		int expected = 3;
		int actual =  pass.score("0123456789");

		assertEquals(expected , actual);
	}

	@Test
	void score_of_long_num_only_pass_2() {
		// "00112233445566778899" should be rated a 3
		PasswordStrength pass = new PasswordStrength();

		int expected = 3;
		int actual =  pass.score("00112233445566778899");

		assertEquals(expected , actual);
	}

	@Test
	void score_of_short_letter_only_pass_1() {
		// "doodle" should be rated a 1
		PasswordStrength pass = new PasswordStrength();

		int expected = 1;
		int actual =  pass.score("doodle");

		assertEquals(expected , actual);
	}

	@Test
	void score_of_short_letter_only_pass_2() {
		// "skittle" should be rated a 1
		PasswordStrength pass = new PasswordStrength();

		int expected = 1;
		int actual =  pass.score("skittle");

		assertEquals(expected , actual);
	}

	@Test
	void score_of_long_letter_only_pass_1() {
		// "skibbitybopmmdada" should be rated a 4
		PasswordStrength pass = new PasswordStrength();

		int expected = 4;
		int actual =  pass.score("skibbitybopmmdada");

		assertEquals(expected , actual);
	}

	@Test
	void score_of_long_letter_only_pass_2() {
		// "SirReginaldVonBartlesby" should be rated a 4
		PasswordStrength pass = new PasswordStrength();

		int expected = 4;
		int actual =  pass.score("SirReginaldVonBartlesby");

		assertEquals(expected , actual);
	}

	@Test
	void score_of_short_symbol_only_pass_1() {
		// "!@#$" should be rated a 1
		PasswordStrength pass = new PasswordStrength();

		int expected = 1;
		int actual =  pass.score("!@#$");

		assertEquals(expected , actual);
	}

	@Test
	void score_of_short_symbol_only_pass_2() {
		// "/*-*&^" should be rated a 1
		PasswordStrength pass = new PasswordStrength();

		int expected = 1;
		int actual =  pass.score("/*-*&^");

		assertEquals(expected , actual);
	}

	@Test
	void score_of_long_symbol_only_pass_1() {
		// "!@#$%^&*" should be rated a 4
		PasswordStrength pass = new PasswordStrength();

		int expected = 4;
		int actual =  pass.score("!@#$%^&*");

		assertEquals(expected , actual);
	}

	@Test
	void score_of_long_symbol_only_pass_2() {
		// "!@#!@#$%^$%^&*&*" should be rated a 4
		PasswordStrength pass = new PasswordStrength();

		int expected = 4;
		int actual =  pass.score("!@#!@#$%^$%^&*&*");

		assertEquals(expected , actual);
	}

	//--------------------TESTING RATING--------------------//
	@Test
	void rating_of_score_0() {
		// a 0 score should be a "very weak" rating
		PasswordStrength pass = new PasswordStrength();

		String expected = "very weak";
		String actual = pass.rating(0);

		assertEquals(expected , actual);
	}

	@Test
	void rating_of_score_1() {
		// a 1 score should be a "very weak" rating
		PasswordStrength pass = new PasswordStrength();

		String expected = "weak";
		String actual = pass.rating(1);
		assertEquals(expected , actual);
	}

	@Test
	void rating_of_score_2() {
		// a 2 score should be a "weak" rating
		PasswordStrength pass = new PasswordStrength();

		String expected = "weak";
		String actual = pass.rating(2);
		assertEquals(expected , actual);
	}

	@Test
	void rating_of_score_3() {
		// a 3 score should be a "weak" rating
		PasswordStrength pass = new PasswordStrength();

		String expected = "weak";
		String actual = pass.rating(3);
		assertEquals(expected , actual);
	}

	@Test
	void rating_of_score_4() {
		// a 4 score should be a "weak" rating
		PasswordStrength pass = new PasswordStrength();

		String expected = "weak";
		String actual = pass.rating(4);
		assertEquals(expected , actual);
	}

	@Test
	void rating_of_score_5() {
		// a 5 score should be a "strong" rating
		PasswordStrength pass = new PasswordStrength();

		String expected = "strong";
		String actual = pass.rating(5);
		assertEquals(expected , actual);
	}

	@Test
	void rating_of_score_6() {
		// a 6 score should be a "strong" rating
		PasswordStrength pass = new PasswordStrength();

		String expected = "strong";
		String actual = pass.rating(6);
		assertEquals(expected , actual);
	}

	@Test
	void rating_of_score_7() {
		// a 7 score should be a "very strong" rating
		PasswordStrength pass = new PasswordStrength();

		String expected = "very strong";
		String actual = pass.rating(7);
		assertEquals(expected , actual);
	}

	//--------------------TESTING NUMBER ANALYSIS--------------------//
	@Test
	void hasNumber_true_1() {
		// "123abc!@#" should produce true
		PasswordStrength pass = new PasswordStrength();

		boolean expected = true;
		boolean actual = pass.hasNumber("123abc!@#");
		assertEquals(expected , actual);
	}

	@Test
	void hasNumber_true_2() {
		// "1928374650" should produce true
		PasswordStrength pass = new PasswordStrength();

		boolean expected = true;
		boolean actual = pass.hasNumber("1928374650");
		assertEquals(expected , actual);
	}

	@Test
	void hasNumber_false_1() {
		// "abc!@#" should produce false
		PasswordStrength pass = new PasswordStrength();

		boolean expected = false;
		boolean actual = pass.hasNumber("abc!@#");
		assertEquals(expected , actual);
	}

	@Test
	void hasNumber_false_2() {
		// "aegrcihrfcgaoinushfgvno" should produce false
		PasswordStrength pass = new PasswordStrength();

		boolean expected = false;
		boolean actual = pass.hasNumber("aegrcihrfcgaoinushfgvno");
		assertEquals(expected , actual);
	}

	//--------------------TESTING LETTER ANALYSIS--------------------//
	@Test
	void hasLetter_true_1() {
		// "wasd123456!@" should produce true
		PasswordStrength pass = new PasswordStrength();

		boolean expected = true;
		boolean actual = pass.hasLetter("wasd123456!@");
		assertEquals(expected , actual);
	}

	@Test
	void hasLetter_true_2() {
		// "gjdhfg" should produce true
		PasswordStrength pass = new PasswordStrength();

		boolean expected = true;
		boolean actual = pass.hasLetter("gjdhfg");
		assertEquals(expected , actual);
	}

	@Test
	void hasLetter_false_1() {
		// "1234567890" should produce false
		PasswordStrength pass = new PasswordStrength();

		boolean expected = false;
		boolean actual = pass.hasLetter("1234567890");
		assertEquals(expected , actual);
	}

	@Test
	void hasLetter_false_2() {
		// "!@#$%^&*" should produce false
		PasswordStrength pass = new PasswordStrength();

		boolean expected = false;
		boolean actual = pass.hasLetter("!@#$%^&*");
		assertEquals(expected , actual);
	}

	//--------------------TESTING SYMBOL ANALYSIS--------------------//
	@Test
	void hasSymbol_true_1() {
		// "!@#$%^&*" should produce true
		PasswordStrength pass = new PasswordStrength();

		boolean expected = true;
		boolean actual = pass.hasSymbol("!@#$%^&*");
		assertEquals(expected , actual);
	}

	@Test
	void hasSymbol_true_2() {
		// "abc123!@#" should produce true
		PasswordStrength pass = new PasswordStrength();

		boolean expected = true;
		boolean actual = pass.hasSymbol("abc123!@#");
		assertEquals(expected , actual);
	}

	@Test
	void hasSymbol_false_1() {
		// "asdfghkj*" should produce false
		PasswordStrength pass = new PasswordStrength();

		boolean expected = false;
		boolean actual = pass.hasSymbol("asdfghkj");
		assertEquals(expected , actual);
	}

	@Test
	void hasSymbol_false_2() {
		// "0123456789" should produce false
		PasswordStrength pass = new PasswordStrength();

		boolean expected = false;
		boolean actual = pass.hasSymbol("0123456789");
		assertEquals(expected , actual);
	}
}