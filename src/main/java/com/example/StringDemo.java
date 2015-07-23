package com.example;

public class StringDemo {
	static int i, c = 0, res;

	static int wordcount(String s) {
		/*String s[]=br.readLine().split(" ");

		System.out.println(s.length);*/
		return s.trim().split(" ").length;
	}

	public static void main(String args[]) {
		res = StringDemo.wordcount("Alive is awesome");
		// string is always passed in double quotes

		System.out.println("The number of words in the String are :  " + res);
	}
}