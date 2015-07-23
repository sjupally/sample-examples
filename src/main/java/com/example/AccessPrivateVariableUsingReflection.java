package com.example;

import java.lang.reflect.Field;

public class AccessPrivateVariableUsingReflection {

	public static void main(String args[]) {
		try {
			@SuppressWarnings("rawtypes")
			Class<DisplayAllDrivesInSystem> c = DisplayAllDrivesInSystem.class;
			Field fields[] = c.getDeclaredFields();

			for (Field fld : fields) {
				System.out.println("field values-->" + fld);
			}
			DisplayAllDrivesInSystem ref = new DisplayAllDrivesInSystem();
			c = (Class<DisplayAllDrivesInSystem>) ref.getClass();
			Field flds = c.getDeclaredField("accessPrivateVariableTest");
			flds.setAccessible(true);
			System.out.println("the private field value before change is-" + flds.get(ref));
			flds.set(ref, "Changed value Kumar Gaurav");
			System.out.println("Now the Private field Value after change is-" + flds.get(ref));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
