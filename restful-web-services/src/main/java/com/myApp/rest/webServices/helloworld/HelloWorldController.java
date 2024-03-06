package com.myApp.rest.webServices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class HelloWorldController {

	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello world";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello world");
	}
	
	@GetMapping(path="/hello-world-bean/path/name/{name}")
	public HelloWorldBean helloWorldBeanPath(@PathVariable String name) {
		return new HelloWorldBean("Hello world,"+name);
	}
}
