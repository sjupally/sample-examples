package com.example;

public class UseOfVolatileExampleDemo extends Thread {
	private volatile int tempVal;

	public void run() {
		System.out.println("*****run method called*****");
		for (int i = 1; i <= 7; i++) {
			try {
				System.out.println(getName() + " Iteration Number :- " + i);
				synchronized (UseOfVolatileExampleDemo.class) {
					if (getName().equals("Thread First # ")) {
						tempVal = tempVal + 100;
						System.out.println("Test Value after " + i + " iteration :- " + tempVal);
					}

					if (getName().equals("Thread Second # ")) {
						tempVal = tempVal + 100;
						System.out.println("Test Value after " + i + " iteration :- " + tempVal);
					}
				}
				Thread.sleep(3000);// For 3s halt
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	public UseOfVolatileExampleDemo(String str) {
		super(str);
	}

	public static void main(String args[]) {
		UseOfVolatileExampleDemo uved = new UseOfVolatileExampleDemo("Thread First # ");
		uved.start();
		UseOfVolatileExampleDemo uved1 = new UseOfVolatileExampleDemo("Thread Second # ");
		uved1.start();
	}
}