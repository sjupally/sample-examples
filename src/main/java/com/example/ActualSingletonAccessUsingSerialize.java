package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ActualSingletonAccessUsingSerialize {
	static ActualSingletonDemo singletonOne = ActualSingletonDemo.getInstance();

	public static void main(String[] args) {
		try {
			// Serialize to a file
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
					"D:\\actualSingletonDemo.ser"));
			out.writeObject(singletonOne);
			out.close();

			singletonOne.setName("KUMAR");

			// DeSerialize from a file
			ObjectInput in = new ObjectInputStream(new FileInputStream(
					"actualSingletonDemo.ser"));
			ActualSingletonDemo singletonTwo = (ActualSingletonDemo) in
					.readObject();
			in.close();

			System.out.println(singletonOne.getName());
			System.out.println(singletonTwo.getName());

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
