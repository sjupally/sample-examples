package com.example;

public class Animal {
	private int age;

	public Animal(int ageVar) {
		this.age = ageVar;
	}

	public int hashCode() {
		return age;
	}

	public boolean equals(Object obj) {
		boolean flag = false;
		Animal animal = (Animal) obj;
		if (animal.age == age) {
			flag = true;
		}
		return flag;
	}
}
