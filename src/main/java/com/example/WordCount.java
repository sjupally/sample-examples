package com.example;

import java.util.*;
import java.io.*;

public class WordCount {
	public static void main(String[] args) throws FileNotFoundException {
		// open the file

		Scanner input = new Scanner(new File("C://Users//sjupally//Desktop//test.txt"));

		// count occurrences
		Map<String, Integer> wordCounts = new TreeMap<String, Integer>();
		while (input.hasNext()) {
			String next = input.next().toLowerCase();
			if (!wordCounts.containsKey(next)) {
				wordCounts.put(next, 1);
			} else {
				wordCounts.put(next, wordCounts.get(next) + 1);
			}
		}

		// get cutoff and report frequencies
		System.out.println("Total words = " + wordCounts.size());
		System.out.print("Minimum number of occurrences for printing? ");
		
		for (String word : wordCounts.keySet()) {
			int count = wordCounts.get(word);

			System.out.println(count + "\t" + word);
		}
	}
}