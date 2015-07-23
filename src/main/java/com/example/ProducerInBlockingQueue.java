package com.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class ProducerInBlockingQueue extends Thread {
	BlockingQueue<String> blockingQueue;

	ProducerInBlockingQueue() {
		blockingQueue = new ArrayBlockingQueue<String>(3);
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				System.out.println("PRODUCED # " + i);
				blockingQueue.put("" + i);
				Thread.sleep(1);
			} catch (InterruptedException ite) {
				System.out.println("THE EXCEPTION IN PRODUCER CLASS IS : - " + ite.getMessage());
			}
		}
	}
}
