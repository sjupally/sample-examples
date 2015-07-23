package com.ws.rpc;

import com.ws.HelloWorld;
import com.ws.HelloWorldImplService;

public class HelloWorldClient{
	 
	public static void main(String[] args) {
 
		HelloWorldImplService helloService = new HelloWorldImplService();
		HelloWorld hello = helloService.getHelloWorldImplPort();
		System.out.println(hello.getHelloWorldAsString("mkyong"));
 
    }
 
}
