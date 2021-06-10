/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package oop.assignment2.ex27.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfoValidatorTest {

	@Test
	void validateInput_all_correct_1() {
		//Jimmy James , 55555 , TK-4210

		InfoValidator test = new InfoValidator();

		String expected = "There were no errors found.";
		String actual = test.validateInput("Jimmy", "James", "55555", "TK-4210");

		assertEquals(expected, actual);
	}

	@Test
	void validateInput_all_correct_2() {
		//chupalupa theAssSucker , 69420 , as-4073

		InfoValidator test = new InfoValidator();

		String expected = "There were no errors found." ;
		String actual = test.validateInput("chupalupa" , "theAssSucker" , "69420" , "as-4073");

		assertEquals(expected , actual);
	}

	@Test
	void validateInput_names_too_short() {
		// j j , 00000 , aa-0000

		InfoValidator test = new InfoValidator();

		String expected = "\"j\" is not a valid first name. It is too short.\n\"j\" is not a valid last name. It is too short.\n" ;
		String actual = test.validateInput("j","j","00000","aa-0000");

		assertEquals(expected , actual);
	}

	@Test
	void validateInput_names_with_numbers() {
		// abc123  abc123, 00000 , aa-0000

		InfoValidator test = new InfoValidator();

		String expected = "The first name must not include numbers.\nThe last name must not include numbers.\n";
		String actual = test.validateInput("abc123", "abc123", "00000", "aa-0000");

		assertEquals(expected, actual);
	}

	@Test
	void validateInput_empty_names() {
		// , 00000 , aa-0000

		InfoValidator test = new InfoValidator();

		String expected = "The first name must be filled in.\nThe last name must be filled in.\n";
		String actual = test.validateInput("", "", "00000", "aa-0000");

		assertEquals(expected, actual);
	}

	@Test
	void validateInput_ZIP_too_short() {
		// throck morton, 69 , aa-0000

		InfoValidator test = new InfoValidator();

		String expected = "The ZIP code must be 5 digits.\n";
		String actual = test.validateInput("throck", "morton", "69", "aa-0000");

		assertEquals(expected, actual);
	}

	@Test
	void validateInput_ZIP_with_chars() {
		// throck morton, asdfg , aa-0000

		InfoValidator test = new InfoValidator();

		String expected = "The ZIP code must be numeric.\n";
		String actual = test.validateInput("throck", "morton", "asdfg", "aa-0000");

		assertEquals(expected, actual);
	}

	@Test
	void validateInput_id_invalid_1() {
		// throck morton, 00000 , 11-0000

		InfoValidator test = new InfoValidator();

		String expected = "11-0000 is not a valid ID.\n";
		String actual = test.validateInput("throck", "morton", "00000", "11-0000");

		assertEquals(expected, actual);
	}

	@Test
	void validateInput_id_invalid_2() {
		// throck morton, 00000 , aa-aaaa

		InfoValidator test = new InfoValidator();

		String expected = "aa-aaaa is not a valid ID.\n";
		String actual = test.validateInput("throck", "morton", "00000", "aa-aaaa");

		assertEquals(expected, actual);
	}

	@Test
	void validateInput_id_invalid_3() {
		// throck morton, 00000 , 123123123123123

		InfoValidator test = new InfoValidator();

		String expected = "123123123123123 is not a valid ID.\n";
		String actual = test.validateInput("throck", "morton", "00000", "123123123123123");

		assertEquals(expected, actual);
	}

	@Test
	void validateInput_id_invalid_4() {
		// throck morton, 00000 , no id

		InfoValidator test = new InfoValidator();

		String expected = "The id must be filled in.\n" ;
		String actual = test.validateInput("throck", "morton", "00000", "");

		assertEquals(expected, actual);
	}
}