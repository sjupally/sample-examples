/**
 * 
 */
package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author sjupally
 *
 */
public class ArrayMerge {
	public static void main(String args[]) {
		String first[] = { "Kumar", "Amit", "Bimal" };
		String second[] = { "Shivam", "Gaurav" };
		List<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList(first));
		list.addAll(Arrays.asList(second));

		Collections.sort(list);

		Object[] third = list.toArray();
		for (Object str : third) {
			System.out.println("Elements are-" + str);
		}
	}
}
