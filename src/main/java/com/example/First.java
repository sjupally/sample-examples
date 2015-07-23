package com.example;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class First implements Externalizable {
	public First() {
		System.out.println("Constructor of class First");
	}

	public void writeExternal(ObjectOutput out) {
		System.out.println("WriteExternal method of class First");
	}

	public void readExternal(ObjectInput in) {
		System.out.println("ReadExternal method of class First");
	}
}
