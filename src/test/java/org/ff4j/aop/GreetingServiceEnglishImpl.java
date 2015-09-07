package org.ff4j.aop;

import org.springframework.stereotype.Component;

@Component("greeting.english")
public class GreetingServiceEnglishImpl implements GreetingService {
	String hello="Hello";
	public String sayHello(String name) {
		return String.format("%s ! %s",hello, name);
	}

	public String sayHelloWithClass(String name) {
		return String.format("%s from %s %s" ,hello, getClass().getSimpleName() , name);
	}
}