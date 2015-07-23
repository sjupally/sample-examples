package com.example;

import java.math.BigDecimal;

public class DoubleForCurrency {

	public static void main(String[] args) {
		double total = 0.2;
		for (int i = 0; i < 100; i++) {
			total += 0.2;
		}
		System.out.println("total = " + total);
		BigDecimal decimal = new BigDecimal("0.2");
		for (int i = 0; i < 100; i++) {
			decimal = decimal.add(new BigDecimal("0.2"));
		}
		System.out.println(decimal.toString());
	}

}