package oop.assignment2.ex40.base;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeDataTest {

	@Test
	void table_prints_1() {
		Map<Object , Employee> employees = new TreeMap<>();

		employees.put("x" , new Employee("a1", "b1", "c1", "d1"));
		employees.put("y" , new Employee("a2", "b2", "c2", "d2"));

		String expected =
				"Name                | Position          | Separation Date\n" +
						"--------------------|-------------------|--------------------\n"+
						"a1 b1               | c1                | d1\n"+
						"a2 b2               | c2                | d2\n";

		String actual = EmployeeData.table(employees);
		assertEquals(expected, actual);

	}

	@Test
	void table_prints_2() {
		Map<Object , Employee> employees = new TreeMap<>();

		employees.put("benis" , new Employee("a1", "b1", "c1", "d1"));
		employees.put("bepis" , new Employee("a2", "b2", "c2", "d2"));
		employees.put("bepitty bepisto" , new Employee("a3", "b3", "c3", "d3"));

		String expected =
				"Name                | Position          | Separation Date\n" +
						"--------------------|-------------------|--------------------\n"+
						"a1 b1               | c1                | d1\n"+
						"a2 b2               | c2                | d2\n"+
						"a3 b3               | c3                | d3\n";

		String actual = EmployeeData.table(employees);
		assertEquals(expected, actual);

	}

	@Test
	void table_prints_empty_map() {
		Map<Object , Employee> employees = new TreeMap<>();

		String expected =
				"Name                | Position          | Separation Date\n" +
						"--------------------|-------------------|--------------------\n";

		String actual = EmployeeData.table(employees);
		assertEquals(expected, actual);

	}

	@Test
	void searchEmployees_1() {
		Map<Object , Employee> employees = new TreeMap<>();

		employees.put("benis" , new Employee("a1", "b1", "c1", "d1"));
		employees.put("bepis" , new Employee("a2", "b2", "c2", "d2"));
		employees.put("bepitty bepisto" , new Employee("a3", "b3", "c3", "d3"));

		String expected =
				"Name                | Position          | Separation Date\n" +
						"--------------------|-------------------|--------------------\n";

		String actual = EmployeeData.searchEmployees(employees, "ztinky");
		assertEquals(expected, actual);
	}

	@Test
	void searchEmployees_2() {
		Map<Object, Employee> employees = new TreeMap<>();

		employees.put("benis", new Employee("a1", "b1", "c1", "d1"));
		employees.put("bepis", new Employee("a2", "b2", "c2", "d2"));
		employees.put("bepitty bepisto", new Employee("a3", "b3", "c3", "d3"));

		String expected =
				"Name                | Position          | Separation Date\n" +
						"--------------------|-------------------|--------------------\n" +
						"a1 b1               | c1                | d1\n" +
						"a2 b2               | c2                | d2\n" +
						"a3 b3               | c3                | d3\n";

		String actual = EmployeeData.searchEmployees(employees, "a");
		assertEquals(expected, actual);
	}

	@Test
	void searchEmployees_3() {
		Map<Object, Employee> employees = new TreeMap<>();

		employees.put("benis", new Employee("a1", "b1", "c1", "d1"));
		employees.put("bepis", new Employee("a2", "b2", "c2", "d2"));
		employees.put("bepitty bepisto", new Employee("a3", "b3", "c3", "d3"));

		String expected =
				"Name                | Position          | Separation Date\n" +
						"--------------------|-------------------|--------------------\n" +
						"a2 b2               | c2                | d2\n";

		String actual = EmployeeData.searchEmployees(employees, "a2");
		assertEquals(expected, actual);
	}
}