package com.ws.rpc;

import javax.xml.ws.Endpoint;
import com.ws.HelloWorldImpl;

//Endpoint publisher
public class HelloWorldPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
	}

}