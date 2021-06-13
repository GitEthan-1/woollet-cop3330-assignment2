/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Woollet
 */
package oop.assignment2.ex37.base;

import java.util.LinkedList;

public class PasswordGenerator {

	private static final LinkedList<Character> LETTER_LIST = new LinkedList<>();
	private static final LinkedList<Character> SPECIAL_CHARACTER_LIST = new LinkedList<>();
	private static final LinkedList<Character> NUMBER_LIST = new LinkedList<>();
	private static String PASSWORD;


	public static String getPASSWORD() {
		return PASSWORD;
	}

	private static LinkedList<Character> getLetterList() {
		return LETTER_LIST;
	}

	private static LinkedList<Character> getSpecialCharacterList() {
		return SPECIAL_CHARACTER_LIST;
	}

	private static LinkedList<Character> getNumberList() {
		return NUMBER_LIST;
	}

	private static void loadLetters() {
		for (int i = 0; i < 26; i++) {
			LETTER_LIST.add((char) (97+i));
		}
		for (int i = 0; i < 26; i++) {
			LETTER_LIST.add((char) (65+i));
		}
	}

	private static void loadSpecials() {
		SPECIAL_CHARACTER_LIST.add('!');
		SPECIAL_CHARACTER_LIST.add('(');
		SPECIAL_CHARACTER_LIST.add(')');
		SPECIAL_CHARACTER_LIST.add('?');
		SPECIAL_CHARACTER_LIST.add('[');
		SPECIAL_CHARACTER_LIST.add(']');
		SPECIAL_CHARACTER_LIST.add('_');
		SPECIAL_CHARACTER_LIST.add('~');
		SPECIAL_CHARACTER_LIST.add('`');
		SPECIAL_CHARACTER_LIST.add(':');
		SPECIAL_CHARACTER_LIST.add(';');
		SPECIAL_CHARACTER_LIST.add('@');
		SPECIAL_CHARACTER_LIST.add('#');
		SPECIAL_CHARACTER_LIST.add('$');
		SPECIAL_CHARACTER_LIST.add('%');
		SPECIAL_CHARACTER_LIST.add('^');
		SPECIAL_CHARACTER_LIST.add('&');
		SPECIAL_CHARACTER_LIST.add('*');
		SPECIAL_CHARACTER_LIST.add('+');
		SPECIAL_CHARACTER_LIST.add('=');

	}

	private static void loadNumbers() {
		for (int i = 0; i < 10; i++) {
			NUMBER_LIST.add((char) (48+i));
		}
	}

	public static void createPassword(int minimumlength, int numbers, int special) {
		loadLetters();
		loadSpecials();
		loadNumbers();

		LinkedList<Character> passwordCharacters = new LinkedList<>();
		StringBuilder password = new StringBuilder();

		getPasswordCharacters(minimumlength, numbers, special, passwordCharacters);

		int length = passwordCharacters.size();

		for (int i = 0; i < length; i++) {
			password.append(passwordCharacters.remove((int)(Math.random() * (passwordCharacters.size() - 1))));
		}

		PASSWORD = password.toString();
	}

	public static void getPasswordCharacters(int minimumlength, int numbers, int special, LinkedList<Character> passwordCharacters) {
		for (int i = 0; i < findLetters(minimumlength, numbers, special); i++) {
			passwordCharacters.add(getRandomLetter());
		}

		for (int i = 0; i < special; i++) {
			passwordCharacters.add(getRandomSpecial());
		}

		for (int i = 0; i < numbers; i++) {
			passwordCharacters.add(getRandomNumber());
		}
	}

	public static int findLetters(int length, int numbers, int special) {
		if(2*(numbers + special) <= length)
			return length-(numbers + special);
		else
			return numbers + special + 1;
	}

	private static char getRandomLetter() {
		return LETTER_LIST.get((int)(Math.random() * (LETTER_LIST.size()-1)));
	}

	private static char getRandomSpecial() {
		return SPECIAL_CHARACTER_LIST.get((int)(Math.random() * (SPECIAL_CHARACTER_LIST.size()-1)));
	}

	private static char getRandomNumber() {
		return NUMBER_LIST.get((int)(Math.random() * (NUMBER_LIST.size()-1)));
	}

}
