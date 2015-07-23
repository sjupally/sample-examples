package com.example;

class Producer extends Thread {
	private SharedObject sharedObject;

	public Producer(SharedObject sharedObj) {
		sharedObject = sharedObj;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			sharedObject.produce(i);
			System.out.println("PRODUCER PRODUCED # : " + i);
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException ite) {
				System.out.println("THE EXECPTION IN THE PRODUCER CLASS IS : - " + ite.getMessage());
			}
		}
	}
}
