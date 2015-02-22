package com.nishanth.endpoint;

import javax.xml.ws.Endpoint;
import com.nishanth.jaxwsservice.HelloWorldImpl;

public class HelloWorldPublisher {
	
	public static void main(String[] args) {
		   Endpoint.publish("http://localhost:9999/webservice/hello", new HelloWorldImpl());
	    }

}
