package org.ff4j.aop;

@Flip(name = "language-french", alterBean = "greeting.french")
public interface GreetingService {
	String sayHello(String name);
	String sayHelloWithClass(String name);
}