/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package oop.assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {
	
	@Test
	void isAnagram_returns_true_when_true_1() {
		
		// "note" and "tone" are anagrams (returns true)
		
		AnagramDetector detector = new AnagramDetector();
		
		boolean expected = true;
		boolean actual = detector.isAnagram("note", "tone");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void isAnagram_returns_true_when_true_2() {
		
		// "kill me" and "el milk" are anagrams
		
		AnagramDetector detector = new AnagramDetector();
		
		boolean expected = true;
		boolean actual = detector.isAnagram("kill me", "el milk");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void isAnagram_returns_true_when_true_3() {
		
		// "butter dog" and "gotter bud" are anagrams
		
		AnagramDetector detector = new AnagramDetector();
		
		boolean expected = true;
		boolean actual = detector.isAnagram("butter dog", "gotter bud");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void isAnagram_returns_false_when_false_1() {
		
		// "abc" and "abddeez nuts" are anagrams
		
		AnagramDetector detector = new AnagramDetector();
		
		boolean expected = false;
		boolean actual = detector.isAnagram("abc", "abcdeez nuts");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void isAnagram_returns_false_when_false_2() {
		
		// "children who like to read" and "cool" are anagrams
		
		AnagramDetector detector = new AnagramDetector();
		
		boolean expected = false;
		boolean actual = detector.isAnagram("children who like to read", "cool");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void isAnagram_returns_false_when_false_3() {
		
		// "banana phone" and "banana cell" are anagrams
		
		AnagramDetector detector = new AnagramDetector();
		
		boolean expected = false;
		boolean actual = detector.isAnagram("banana phone", "banana cell");

		assertEquals(expected, actual);
	}
}