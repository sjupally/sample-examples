package com.example;

public class TestEqualsAndHashCode {
	public static void main(String args[]) {

		Animal animal1 = new Animal(12);
		Animal animal2 = new Animal(12);

		System.out.println("Both Animal objects are equal-" + animal1.equals(animal2));
		System.out.println("Animal objects references are equal-" + (animal1 == animal2));

	}
}
