package com.example;

class Student {
	public int studAge;
	public String studName;

	public Student(int age, String name) {
		this.studAge = age;
		this.studName = name;
	}

	public Object Clone() throws CloneNotSupportedException {
		return this;
	}

	public String toString() {
		return "Student name is " + studName + " & Age is " + studAge;
	}
}
