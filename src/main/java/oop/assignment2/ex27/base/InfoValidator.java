package oop.assignment2.ex27.base;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class InfoValidator{
	public void validateInput(String fname, String lname, String zip, String id) {
		if( validateName(fname, "first name") && validateName(lname, "last name") && validateZIP(zip) &&validateID(id))
			System.out.println("There were no errors found.");

	}

	private boolean validateName(String name, String typeName) {
		if(StringUtils.indexOfAny(name, '0','1','2','3','4','5','6','7','8','9') != -1){
			System.out.println("The " + typeName + " must not include numbers.");
			return false;
		}
		else if(name.length() == 0)
		{
			System.out.println("The " + typeName + " must be filled in.");
			return false;
		}
		else if(name.length() == 1) {
			System.out.println("\"" + name + " is not a valid " + typeName + ". It is too short.");
			return false;
		}
		else
			return true;
	}

	private boolean validateID(String id) {
		String[] arr = id.split("-");
		System.out.println( "array size: " + arr.length + "\n" + arr[0] + "-" + arr[1]);
		return false;
	}

	private boolean validateZIP(String zip) {
		try {
			int zipInt = Integer.parseInt(zip);
			if (zipInt <= 9999 || zipInt >= 100000) {
				System.out.println("The ZIP code must be 5 digits.");
				return false;
			}
			else
				return true;
		}
		catch(NumberFormatException nfe) {
			System.out.println("The ZIP code must be numeric.");
			return false;
		}
	}
}
