package com.nishanth.jaxwsservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;

@WebService(endpointInterface = "com.nishanth.jaxwsservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	public String getMessage(String name) {
		return "Hello " + name;
	}

}
