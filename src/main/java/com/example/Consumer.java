package com.example;

class Consumer extends Thread {
	private SharedObject sharedObject;

	public Consumer(SharedObject sharedObj) {
		sharedObject = sharedObj;
	}

	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {
			value = sharedObject.consume();
			System.out.println("CONSUMER CONSUMED # : " + value);
		}
	}
}