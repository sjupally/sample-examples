package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

class SharedObject {
	private int naturalNumber;
	private boolean sharedObjectAvailability = false;

	public synchronized int consume() {
		while (sharedObjectAvailability == false) {
			try {
				wait();
			} catch (InterruptedException ite) {
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ite);
			}
		}
		sharedObjectAvailability = false;
		notifyAll();
		return naturalNumber;
	}

	public synchronized void produce(int numericValue) {
		while (sharedObjectAvailability == true) {
			try {
				wait();
			} catch (InterruptedException ite) {
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ite);
			}
		}
		naturalNumber = numericValue;
		sharedObjectAvailability = true;
		notifyAll();
	}
}
