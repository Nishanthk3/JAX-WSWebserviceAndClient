package com.nishanth.jaxwsclient;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.nishanth.jaxwsservice.HelloWorld;

public class HelloWorldClient {

	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("http://localhost:9999/webservice/hello?wsdl");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		QName qName = new QName("http://jaxwsservice.nishanth.com/", "HelloWorldImplService");
		Service service = Service.create(url,qName);
		HelloWorld jaxWs = service.getPort(HelloWorld.class);
		System.out.println(jaxWs.getMessage("JAX-WS WebService"));
	}

}
