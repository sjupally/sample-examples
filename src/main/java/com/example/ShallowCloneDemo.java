package com.example;

public class ShallowCloneDemo {
	public ShallowCloneDemo() throws CloneNotSupportedException {
		Student std1 = new Student(32, "Gaurav");
		Student std2 = (Student) std1.Clone();
		System.out.println("The Cloned object before change-" + std2);
		std2.studAge = 25;
		std2.studName = "Aryan";
		System.out.println("The Cloned object after change-" + std2);
		System.out.println("The Original Object is-" + std1);
	}

	@SuppressWarnings("unused")
	public static void main(String args[]) throws CloneNotSupportedException {
		ShallowCloneDemo swt = new ShallowCloneDemo();
	}
}