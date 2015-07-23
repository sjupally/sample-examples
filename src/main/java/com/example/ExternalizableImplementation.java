package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableImplementation {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Constructing objects to persist:");
		First objectDemo1 = new First();
		Second objectDemo2 = new Second();
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("ExternalizationExampleFile.out"));
		System.out.println("Persisting objects:");
		o.writeObject(objectDemo1);
		o.writeObject(objectDemo2);
		o.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("ExternalizationExampleFile.out"));
		System.out.println("Reading back the objectDemo1:*****************");
		objectDemo1 = (First) in.readObject();
		System.out.println("Reading back the objectDemo2:*****************");
		objectDemo2 = (Second) in.readObject();

	}
}
