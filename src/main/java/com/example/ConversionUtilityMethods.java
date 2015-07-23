package com.example;

import java.util.ArrayList;
import java.util.List;

public class ConversionUtilityMethods {

	// How to convert a string into a List?
	/** This is the utility method to convert a string into a List */
	public static List<Character> string2List(String stringData) {
		List<Character> characterList = new ArrayList<Character>();
		for (int i = 0; i < stringData.length(); i++) {
			characterList.add(stringData.charAt(i));
		}
		return characterList;
	}

	// How to convert a char array into a List?
	/** This is the utility method to convert a char array into a List */
	public static List<Character> charArray2List(char[] charArray) {
		List<Character> characterList = new ArrayList<Character>();
		for (int i = 0; i < charArray.length; i++) {
			characterList.add(charArray[i]);
		}
		return characterList;
	}

	// How to convert a string array into a List?
	/** This is the utility method to convert a string array into a List */
	public static List<String> StringArray2List(String[] strArray) {
		List<String> stringLst = new ArrayList<String>();
		for (String s : strArray) {
			stringLst.add(s);
		}
		return stringLst;
	}

	public static void main(String args[]) {
		String strData = "GAURAV";
		List<Character> characterList = new ArrayList<Character>(0);
		/** This is the invocation of String to List conversion method */
		characterList = string2List(strData);
		System.out.println("***********************************");
		System.out.println("character list size When String is passed to convert into List - " + characterList.size());
		for (Character character : characterList) {
			System.out.println("Elements are-" + character);
		}

		String strCharArrayData = "ARYANGAURAV";
		char[] charArray = strCharArrayData.toCharArray();
		List<Character> charList = new ArrayList<Character>(0);
		/** This is the invocation of Char array to List conversion method */
		charList = charArray2List(charArray);
		System.out.println("***********************************");
		System.out.println("char list size is When char array is passed to convert into List - " + charList.size());
		for (Character character : charList) {
			System.out.println("Elements are-" + character);
		}

		String[] strArray = { "K", "U", "M", "A", "R", "G", "A", "U", "R", "A", "V" };
		List<String> stringList = new ArrayList<String>();
		/** This is the invocation of String array to List conversion method */
		stringList = StringArray2List(strArray);
		System.out.println("***********************************");
		System.out.println("String list size When String Array is passed to convert into List - " + stringList.size());
		for (String str : stringList) {
			System.out.println("String List elements are - " + str);
		}

	}
}