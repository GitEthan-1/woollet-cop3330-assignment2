/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package oop.assignment2.ex34.base;

import java.util.LinkedList;

public class Employees {
	private static LinkedList<String> EMPLOYEE_LIST;

	public static void setEmployeeList(LinkedList<String> employeeList) {
		EMPLOYEE_LIST = employeeList;
	}

	public static void setDefualtEmployees() {
		Employees.setEmployeeList(new LinkedList<String>());
		EMPLOYEE_LIST.add("John Smith");
		EMPLOYEE_LIST.add("Jackie Jackson");
		EMPLOYEE_LIST.add("Chris Jones");
		EMPLOYEE_LIST.add("Amanda Cullen");
		EMPLOYEE_LIST.add("Jeremy Goodwin");
	}

	public static LinkedList<String> getEmployeeList() {
		return EMPLOYEE_LIST;
	}

	public static void printList() {
		System.out.println("\nThere are " + numberOfEmployees() + " employees:\n");
		for (String name : EMPLOYEE_LIST)
			System.out.println(name);
		System.out.println();
	}

	public static void remove(String remove) {
		EMPLOYEE_LIST.removeIf(remove::contentEquals);
	}

	public static int numberOfEmployees() {
			return EMPLOYEE_LIST.size();
	}
}
