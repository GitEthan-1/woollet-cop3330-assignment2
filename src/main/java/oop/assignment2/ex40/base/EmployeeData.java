/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Woollet
 */
package oop.assignment2.ex40.base;

import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EmployeeData {
	public static Map<Object, Employee> loadEmployees() {
		Map<Object , Employee> employees = new TreeMap<>();

		employees.put("Johnson".toLowerCase(Locale.ROOT) , new Employee("John" , "Johnson" , "Manager" , "2016-12-31"));
		employees.put("Xiong".toLowerCase(Locale.ROOT) , new Employee("Tao" , "Xiong" , "Software Engineer" , "2016-10-05"));
		employees.put("Michaelson".toLowerCase(Locale.ROOT) , new Employee("Michaela" , "Michaelson" , "District Manager" , "2015-12-19"));
		employees.put("Jacobson".toLowerCase(Locale.ROOT) , new Employee("Jake" , "Jacobson" , "Programmer" , ""));
		employees.put("Jackson".toLowerCase(Locale.ROOT) , new Employee("Jacquelyn" , "Jackson" , "DBA" , ""));
		employees.put("Webber".toLowerCase(Locale.ROOT) , new Employee("Sally" , "Webber" , "Web Developer" , "2015-12-18"));

		return employees;
	}


	public static String table(Map<Object, Employee> employees) {
		StringBuilder output = new StringBuilder();
		output.append("""
				Name                | Position          | Separation Date
				--------------------|-------------------|--------------------
				""");

		Set<Map.Entry<Object, Employee>> entrySet = employees.entrySet();
		Map.Entry[] array = entrySet.toArray(new Map.Entry[0]);

		for (int i = 0; i < array.length; i++) {

			String name = (String) array[i].getKey();
			StringBuilder fname = new StringBuilder(employees.get(name).getFirstName() + " " +employees.get(name).getLastName());
			StringBuilder pos = new StringBuilder(employees.get(name).getPosition());
			String date = employees.get(name).getSeparationDate();

			// adding whitespace for table formatting
			while (fname.length() != 20)
				fname.append(" ");
			while (pos.length() != 18)
				pos.append(" ");

			output.append(String.format("%s%s %s%s %s\n", fname, "|", pos, "|", date));
		}
		return output.toString();
	}


	public static String searchEmployees(Map<Object, Employee> employees, String search) {
		StringBuilder output = new StringBuilder();
		output.append("""
				Name                | Position          | Separation Date
				--------------------|-------------------|--------------------
				""");

		Set<Map.Entry<Object, Employee>> entrySet = employees.entrySet();
		Map.Entry[] array = entrySet.toArray(new Map.Entry[0]);

		for (int i = 0; i < array.length; i++) {

			if(employees.get(array[i].getKey()).getFirstName().toLowerCase(Locale.ROOT).contains(search) || employees.get(array[i].getKey()).getLastName().toLowerCase(Locale.ROOT).contains(search)) {
				String name = (String) array[i].getKey();
				StringBuilder fname = new StringBuilder(employees.get(name).getFirstName() + " " +employees.get(name).getLastName());
				StringBuilder pos = new StringBuilder(employees.get(name).getPosition());
				String date = employees.get(name).getSeparationDate();

				// adding whitespace for table formatting
				while (fname.length() != 20)
					fname.append(" ");
				while (pos.length() != 18)
					pos.append(" ");

				output.append(String.format("%s%s %s%s %s\n", fname, "|", pos, "|", date));
			}
		}
		return output.toString();
	}
}
