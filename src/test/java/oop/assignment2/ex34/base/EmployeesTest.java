/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Woollet
 */
package oop.assignment2.ex34.base;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesTest {

	@Test
	void remove_Jackie_Jackson() {
		Employees.setDefualtEmployees();
		Employees.remove("Jackie Jackson");
		LinkedList<String> list = Employees.getEmployeeList();
		if(list.contains("Jackie Jackson"))
			fail();
	}

	@Test
	void remove_Jeremy_Goodwin() {
		Employees.setDefualtEmployees();
		Employees.remove("Jeremy Goodwin");
		LinkedList<String> list = Employees.getEmployeeList();
		if(list.contains("Jeremy Goodwin"))
			fail();

	}

	@Test
	void numberOfEmployees_0_employees() {
		Employees.setEmployeeList(new LinkedList<String>());
		int expected = 0;
		int actual = Employees.numberOfEmployees();

		assertEquals(expected, actual);
	}

	@Test
	void numberOfEmployees_5_employees() {
		Employees.setDefualtEmployees();
		int expected = 5;
		int actual = Employees.numberOfEmployees();

		assertEquals(expected, actual);
	}
}