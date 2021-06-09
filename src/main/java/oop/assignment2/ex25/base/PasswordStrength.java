/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package oop.assignment2.ex25.base;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;
import java.util.regex.Pattern;

public class PasswordStrength {
	public int score(String pass) {

		int sum=0;

		if(pass.length() >= 8)
			sum += 2;
		else
			sum += -1;

		if(hasNumber(pass))
			sum += 1;

		if(hasLetter(pass))
			sum+= 2;

		if(hasSymbol(pass))
			sum+= 2;

		return sum;
	}


	public String rating(int score) {
		return switch(score) {
			case 0:
				yield "very weak";

			case 1,2,3,4:
				yield "weak";

			case 5,6:
				yield "strong";

			case 7:
				yield "very strong";

			default:
				yield "dumb";
		};
	}


	public boolean hasNumber(String pass) {
		return StringUtils.indexOfAny(pass, '0','1','2','3','4','5','6','7','8','9') != -1;
	}


	public boolean hasLetter(String pass) {
		pass = pass.toLowerCase(Locale.ROOT);
		return StringUtils.indexOfAny(pass, 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm') != -1;
	}


	public boolean hasSymbol(String pass) {
		return StringUtils.indexOfAny(pass, '!','@','#','$','%','^','&','*','(',')','_','-','+','/','.','?','~','{','}','[',']',':',',','\'') != -1;
	}
}
