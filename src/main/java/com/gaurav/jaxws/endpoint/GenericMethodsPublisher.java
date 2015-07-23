package com.gaurav.jaxws.endpoint;

import javax.xml.ws.Endpoint;

import com.gaurav.jaxws.services.GenericMethodsImpl;

public class GenericMethodsPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7070/jaxws/genericMethods", new GenericMethodsImpl());
		System.out.println(" Services are published successfully ");
	}
}
