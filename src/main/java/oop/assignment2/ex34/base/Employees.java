/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package oop.assignment2.ex34.base;

public class Employees {
	public static String[] EMPLOYEE_LIST = {
			"John Smith" ,
			"Jackie Jackson" ,
			"Chris Jones" ,
			"Amanda Cullen" ,
			"Jeremy Goodwin" };

	public static void printList() {
		System.out.println("\nThere are " + numberOfEmployees() + " employees:\n");
		for (int i = 0; i < EMPLOYEE_LIST.length; i++) {
			if(EMPLOYEE_LIST[i].length() != 0)
				System.out.println(EMPLOYEE_LIST[i]);
		}
		System.out.println();
	}

	public static void remove(String remove) {
		for (int i = 0; i < EMPLOYEE_LIST.length; i++) {
			if(remove.contentEquals(EMPLOYEE_LIST[i]))
				EMPLOYEE_LIST[i] = "";
		}
	}

	public static int numberOfEmployees() {
		int num=0;
		for (int i = 0; i < EMPLOYEE_LIST.length; i++) {
			if(EMPLOYEE_LIST[i].length() != 0)
				num++;
		}
		return num;
	}
}
