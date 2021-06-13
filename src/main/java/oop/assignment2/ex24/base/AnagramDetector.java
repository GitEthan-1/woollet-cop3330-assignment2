/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Woollet
 */
package oop.assignment2.ex24.base;

import java.util.Arrays;

public class AnagramDetector {
	public boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		
		// sort array then compare
		char[] arr1 = s1.toCharArray();
		Arrays.sort(arr1);
		
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}
}
