/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Woollet
 */
package oop.assignment2.ex38.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NumberFilterTest {

	@Test
	void filterEvenNumbers() {
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Integer> evenNumbers = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			numbers.add(i);
		}
		numbers = NumberFilter.filterEvenNumbers(numbers);

		for (int i = 0; i <1000; i+=2) {
			evenNumbers.add(i);
		}

		if(evenNumbers.size() != numbers.size())
			fail();

		for (int i = 0; i < evenNumbers.size(); i++) {
			if(!evenNumbers.get(i).equals(numbers.get(i)))
				fail();
		}
	}

	@Test
	void evenNumbers() {
		ArrayList<Integer> evenNumbers = new ArrayList<>();

		for (int i = 0; i <20; i+=2) {
			evenNumbers.add(i);
		}

		String actual = NumberFilter.evenNumbers(evenNumbers);
		String expected = "0 2 4 6 8 10 12 14 16 18 ";

		assertEquals(expected, actual);
	}
}