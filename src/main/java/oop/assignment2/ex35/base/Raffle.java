/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Woollet
 */
package oop.assignment2.ex35.base;

import java.util.LinkedList;

public class Raffle {
	private static LinkedList<String> CONTESTANTS;

	public static LinkedList<String> getCONTESTANTS() {

		return CONTESTANTS;
	}

	public int getLengthCONTESTANTS() {

		return CONTESTANTS.size();
	}

	public void setCONTESTANTS(LinkedList<String> CONTESTANTS) {

		Raffle.CONTESTANTS = CONTESTANTS;
	}

	public int getRandomIndex() {
		try {
			return (int) (Math.random() * CONTESTANTS.size());
		}
		catch (NullPointerException npe) {
			return -1;
		}
	}

	public String getRandomPerson() {
		try {
			return CONTESTANTS.get(getRandomIndex());
		}
		catch (IndexOutOfBoundsException ioobe) {
			return "Nobody! Because you SUCK at following directions";
		}
	}
}
