package com.example;

import java.io.IOException;

public class Base {
	private String s;
	public Base() {
		super();
	}

	private final static String s2 = "2";

	public static void doSomething()  {
		System.out.println("doSomething in Base");
	}

	public static void main(String args[]) {
		String s = "XyzWS.com";

		System.out.println(s.substring(2, 2).intern());

	}

	private static boolean isPalindromeString(String str) {
		if (str == null)
			return false;
		int length = str.length();
		System.out.println(length / 2);
		for (int i = 0; i < length / 2; i++) {
			if (str.charAt(i) != str.charAt(length - i - 1))
				return false;
		}
		return true;
	}

	static int missingNumber() {
		int[] a1 = { 1, 2, 3, 5 };

		int missing = 0;
		int sumofA1 = 0;
		int sumofA2 = 0;
		for (int i = 0; i < a1.length; i++) {
			sumofA1 = sumofA1 + a1[i];
		}
		System.out.println("sumofA1 " + sumofA1);
		for (int i = 0; i <= 5; i++) // 5 will become 100 or any dynamic value
		{
			sumofA2 = sumofA2 + i;
		}

		return sumofA2 - sumofA1;
	}

	public static int reverseNumber(int number) {

		int reverse = 0;
		while (number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}
		return reverse;
	}

	public static String reverse(String orininal) {
		// System.out.println(orininal);
		String reverseValue = "";
		int n = orininal.length();
		for (int i = n - 1; i >= 0; i--) {
			// System.out.println(reverseValue);
			reverseValue = reverseValue + orininal.charAt(i);
		}
		return reverseValue;

	}

}
