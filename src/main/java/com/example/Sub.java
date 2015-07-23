package com.example;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Sub extends Base {

	public static void doSomething() {
		try {
			System.out.println("doSomething in sub");
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		Base base = new Sub();
		base.doSomething();
	}
}
