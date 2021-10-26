package com.cg.batch.day5.inheritance.abstrac;

public class Throwsdemo {
	public static int divideNumbers(int dividend, int divisor) throws ArithmeticException {

		return dividend / divisor;

	}

	public static void main(String[] args) {

		System.out.println("Start");
		try {
			System.out.println(Throwsdemo.divideNumbers(10, 0));
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		System.out.println("End");

	}
}
