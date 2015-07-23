package com.example;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MethodParameterType {
	<T extends List<T>> void m(String p1, T p2, List<?> p3, List<T> p4) {
	}

	public static void main(String[] args) {
		MethodParameterType methodParameterType = new MethodParameterType();
		//methodParameterType.m("@", new ArrayList<Integer>(), new ArrayList<Employee>(), new ArrayList<LinkedList<String>>());
		for (Method method : MethodParameterType.class.getDeclaredMethods()) {
			for (Type type : method.getGenericParameterTypes()) {
				System.out.println(method.getName() + " - " + Generics.typeToString(type));
			}
		}
	}
}