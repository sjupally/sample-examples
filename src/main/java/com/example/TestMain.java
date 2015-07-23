package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(30, "ABC"));
		list.add(new Employee(34, "XYZ"));
		list.add(new Employee(23, "WSD"));
		System.out.println(list);
		Collections.sort(list, new EmployeeComparator());
		System.out.println(list);
	}

}
