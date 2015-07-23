package com.example;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		SharedObject sharedObject = new SharedObject();
		Producer producer = new Producer(sharedObject);
		Consumer consumer = new Consumer(sharedObject);
		producer.start();
		consumer.start();
	}
}