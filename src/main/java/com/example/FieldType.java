package com.example;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FieldType<K extends Number, V extends List<String> & Collection<String>> {
	List fRaw;

	List<Object> fTypeObject;

	List<String> fTypeString;

	List<?> fWildcard;

	List<? super List<String>> fBoundedWildcard;

	Map<String, List<Set<Long>>> fTypeNested;

	Map<K, V> fTypeLiteral;

	K[] fGenericArray;

	public static void main(String[] args) {
		for (Field field : FieldType.class.getDeclaredFields()) {
			Type type = field.getGenericType();
			System.out.println(field.getName() + " - " + Generics.typeToString(type));
		}
	}
}