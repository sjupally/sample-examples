package com.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ActualSingletonAccessUsingReflection {
	public static void main(String[] args) throws InvocationTargetException {
		try {
			System.out.println("Inside main() - Getting the first singleton instance using getInstance() method...");
			ActualSingletonDemo asd = ActualSingletonDemo.getInstance();
			System.out.println("The first instance is-" + asd);
			System.out.println("Inside main() - Trying to use reflection to get another instance...");
			Class<ActualSingletonDemo> clazz = ActualSingletonDemo.class;
			Constructor<ActualSingletonDemo> cons = clazz.getDeclaredConstructor();
			cons.setAccessible(true);
			ActualSingletonDemo asd2 = cons.newInstance();
			System.out.println("The another instance is-" + asd2);
		} catch (SecurityException se) {
			se.getMessage();
		} catch (NoSuchMethodException nsme) {
			nsme.getMessage();
		} catch (IllegalArgumentException iae) {
			iae.getMessage();
		} catch (InstantiationException ie) {
			ie.getMessage();
		} catch (IllegalAccessException iae) {
			iae.getMessage();
		}
	}
}