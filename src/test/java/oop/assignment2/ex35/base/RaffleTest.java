/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package oop.assignment2.ex35.base;

import org.junit.jupiter.api.Test;

import java.io.LineNumberInputStream;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class RaffleTest {

	@Test
	void getRandomIndex_empty_list() {
		Raffle test = new Raffle();
		test.setCONTESTANTS(null);
		int expected = -1;
		int actual = test.getRandomIndex();

		assertEquals(expected , actual);
	}

	@Test
	void getRandomIndex_not_empty_list() {
		Raffle test = new Raffle();
		LinkedList<String> list = new LinkedList<String>();

		for (int i = 0; i < 5; i++) {
			list.add(""+i);
		}
		test.setCONTESTANTS(list);
		boolean expected = true;
		boolean actual = test.getRandomIndex() < test.getLengthCONTESTANTS() && test.getRandomIndex() >=0;


		assertEquals(expected , actual);
	}

}