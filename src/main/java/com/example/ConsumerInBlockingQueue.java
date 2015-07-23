package com.example;

import java.util.concurrent.TimeUnit;

class ConsumerInBlockingQueue extends Thread {
	ProducerInBlockingQueue producerInBlockingQueue;

	ConsumerInBlockingQueue(ProducerInBlockingQueue prodInBlockingQueue) {
		this.producerInBlockingQueue = prodInBlockingQueue;
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				System.out.println("CONSUMED # " + producerInBlockingQueue.blockingQueue.poll(5, TimeUnit.SECONDS));
				Thread.sleep(2000);
			} catch (InterruptedException ite) {
				System.out.println("THE EXCEPTION IN CONSUMER CLASS IS : - " + ite.getMessage());
			}
		}
	}
}