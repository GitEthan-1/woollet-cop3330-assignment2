package oop.assignment2.ex34.base;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesTest {

	@Test
	void remove_Jackie_Jackson() {
		Employees.remove("Jackie Jackson");
		boolean expected = true;
		boolean actual = true;
		for (int i = 0; i < Employees.EMPLOYEE_LIST.length; i++) {
			if(Employees.EMPLOYEE_LIST[i].contentEquals("Jackie Jackson"))
				actual = false;
		}

		assertEquals(expected , actual);
	}

	@Test
	void remove_Jeremy_Goodwin() {
		Employees.remove("Jeremy Goodwin");
		boolean expected = true;
		boolean actual = true;
		for (int i = 0; i < Employees.EMPLOYEE_LIST.length; i++) {
			if(Employees.EMPLOYEE_LIST[i].contentEquals("Jeremy Goodwin"))
				actual = false;
		}

		assertEquals(expected , actual);
	}

	@Test
	void numberOfEmployees_0_employees() {
		Arrays.fill(Employees.EMPLOYEE_LIST, "");
		int expected = 0;
		int actual = Employees.numberOfEmployees();

		assertEquals(expected , actual);
	}
}