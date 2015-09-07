package org.ff4j.aop;

import org.springframework.stereotype.Component;

@Component("greeting.french")
public class GreetingServiceFrenchImpl implements GreetingService {
	String hello="Bonjour";
	public String sayHello(String name) {
		return String.format("%s ! %s",hello, name);
	}

	public String sayHelloWithClass(String name) {
		return String.format("%s from %s %s" ,hello, getClass().getSimpleName() , name);
	}
}