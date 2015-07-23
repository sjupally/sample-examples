package com.example;

public class NumberFormatExceptiontest {

	private static String number = "140.56";
	private static String testStr = "GAURAV";

	private static Double getTransactionAmount(String number) {
		Double xx = Double.parseDouble(number);
		return xx;
	}

	public static boolean isNum(String s) {
		try {
			Double.parseDouble(s);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static void main(String args[]) {

		// Check for number.

		boolean flag = isNum(number);
		Double num = 0.0;

		System.out.println("flag--" + flag);

		if (flag) {
			num = getTransactionAmount(number);
		}
		System.out.println("Number is-" + num);

		// Check for actual String value.

		boolean flag1 = isNum(testStr);
		Double num1 = 0.0;
		System.out.println("flag1 value --" + flag1);

		if (flag1) {
			num1 = getTransactionAmount(testStr);
		}
		System.out.println("Number is-" + num1);
	}
}
