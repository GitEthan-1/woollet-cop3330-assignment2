/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Woollet
 */
package oop.assignment2.ex39.base;

import java.util.Map;

public class Employee {
	private String firstName;
	private String lastName;
	private String position;
	private String separationDate;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSeparationDate() {
		return separationDate;
	}

	public void setSeparationDate(String separationDate) {
		this.separationDate = separationDate;
	}

	public Employee(String fname, String lname, String pos, String sep) {
		this.firstName = fname;
		this.lastName = lname;
		this.position = pos;
		this.separationDate = sep;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", position='" + position + '\'' +
				", separationDate='" + separationDate + '\'' +
				'}';
	}
}
