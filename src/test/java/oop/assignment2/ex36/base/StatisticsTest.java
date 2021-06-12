package oop.assignment2.ex36.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {

	@Test
	void sum_1() {
		Statistics stat = new Statistics();
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		int expected = 15;
		int actual = stat.sum(numbers);

		assertEquals(expected, actual);

	}

	@Test
	void sum_2() {
		Statistics stat = new Statistics();
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(100);
		numbers.add(200);
		numbers.add(1000);
		numbers.add(300);

		int expected = 1600;
		int actual = stat.sum(numbers);

		assertEquals(expected, actual);

	}

	@Test
	void average_1() {
		Statistics stat = new Statistics();
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		double expected = 3.0;
		double actual = stat.average(numbers);

		assertEquals(expected, actual, 0.0001);
	}

	@Test
	void average_2() {
		Statistics stat = new Statistics();
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(100);
		numbers.add(200);
		numbers.add(1000);
		numbers.add(300);

		double expected = 400.0;
		double actual = stat.average(numbers);

		assertEquals(expected, actual, 0.0001);
	}

	@Test
	void findMax_1() {
		Statistics stat = new Statistics();
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		int expected = 5;
		int actual = stat.max(numbers);

		assertEquals(expected, actual);
	}

	@Test
	void max_2() {
		Statistics stat = new Statistics();
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(100);
		numbers.add(200);
		numbers.add(1000);
		numbers.add(300);

		int expected = 1000;
		int actual = stat.max(numbers);

		assertEquals(expected, actual);
	}

	@Test
	void min_1() {
		Statistics stat = new Statistics();
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		int expected = 1;
		int actual = stat.min(numbers);

		assertEquals(expected, actual);
	}

	@Test
	void min_2() {
		Statistics stat = new Statistics();
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(100);
		numbers.add(200);
		numbers.add(1000);
		numbers.add(300);

		int expected = 100;
		int actual = stat.min(numbers);

		assertEquals(expected, actual);
	}

	@Test
	void std_1() {
		Statistics stat = new Statistics();
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		double expected = 1.41;
		double actual = stat.std(numbers);

		assertEquals(expected , actual , 0.001);

	}

	@Test
	void std_2() {
		Statistics stat = new Statistics();
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(100);
		numbers.add(200);
		numbers.add(1000);
		numbers.add(300);

		double expected = 353.55;
		double actual = stat.std(numbers);

		assertEquals(expected , actual , 0.001);

	}
}