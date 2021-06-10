package oop.assignment2.ex26.base;

public class PaymentCalculator {
	public int calculateMonthsUntilPaidOff(int balance, double apr, int payment) {
		apr /= 100;
		double numerator = -1* Math.log(1 + (1.0 * balance / payment) * (1 - Math.pow( 1 + (apr / 365), 30))) / (30 * Math.log( 1 + (apr / 365)));
		return (int)Math.ceil(numerator);
	}
}
