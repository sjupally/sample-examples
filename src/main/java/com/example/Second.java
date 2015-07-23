package com.example;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Second implements Externalizable {
	public Second() {
		System.out.println("Constructor of class Second");
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("WriteExternal method of class Second");
	}

	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		System.out.println("ReadExternal method of class Second");
	}
}