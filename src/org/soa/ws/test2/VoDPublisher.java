package org.soa.ws.test2;

import javax.xml.ws.Endpoint;

public class VoDPublisher {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:1234/vodws", new VoDContractImpl());
	}
}
