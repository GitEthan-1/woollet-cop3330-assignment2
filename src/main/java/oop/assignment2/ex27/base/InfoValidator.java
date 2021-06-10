/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package oop.assignment2.ex27.base;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class InfoValidator{
	public String validateInput(String fname, String lname, String zip, String id) {
		String output = validateName(fname, "first name") + validateName(lname, "last name") + validateZIP(zip) + validateID(id);

		if(output.length() == 0)
			return "There were no errors found." ;
		else
			return output;

	}

	private String validateName(String name, String typeName) {
		if(StringUtils.indexOfAny(name, '0','1','2','3','4','5','6','7','8','9') != -1){
			return "The " + typeName + " must not include numbers.\n" ;
		}
		else if(name.length() == 0)
		{
			return "The " + typeName + " must be filled in.\n";
		}
		else if(name.length() == 1) {
			return "\"" + name + "\" is not a valid " + typeName + ". It is too short.\n";
		}
		else
			return "";
	}

	private String validateID(String id) {
		String[] arr = id.split("-");
		if(id.length() == 0)
			return "The id must be filled in.\n" ;
		try {
			Integer.parseInt(arr[1]);

			if (StringUtils.indexOfAny(arr[0], '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ',','!','@','#','$','%','^','&','*') != -1)
				throw new NumberFormatException();

			return "";
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException nfe) {
			return id + " is not a valid ID.\n" ;
		}
	}

	private String validateZIP(String zip) {
		try {
			int zipInt = Integer.parseInt(zip);
			if (zip.length() !=5) {
				return "The ZIP code must be 5 digits.\n" ;
			}
			else
				return "";
		}
		catch(NumberFormatException nfe) {
			return "The ZIP code must be numeric.\n" ;
		}
	}
}
