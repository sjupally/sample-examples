package com.example;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	public int compare(Employee obj1, Employee obj2) {
		int result = 0;
		Employee emp = (Employee) obj1;
		Employee emp1 = (Employee) obj2;

		Integer int1 = new Integer(emp.getAge());
		Integer int2 = new Integer(emp1.getAge());

		result = int1.compareTo(int2);

		if (result == 0) {
			result = emp.getName().compareTo(emp1.getName());

		}

		return result;
	}
}
