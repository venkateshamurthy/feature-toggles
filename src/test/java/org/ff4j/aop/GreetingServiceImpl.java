package org.ff4j.aop;

public class GreetingServiceImpl implements GreetingService {
	String hello;
	public String sayHello(String name) {
		return String.format("%s ! %s",hello, name);
	}

	public String sayHelloWithClass(String name) {
		return String.format("%s from %s %s" ,hello, getClass().getSimpleName() , name);
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
}