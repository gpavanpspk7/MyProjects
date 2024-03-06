package com.myApp.rest.webServices.helloworld;

public class HelloWorldBean {

	private String messsage;
	
	

	public HelloWorldBean(String message) {
		this.messsage=message;
	}



	public String getMesssage() {
		return messsage;
	}



	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}



	@Override
	public String toString() {
		return "HelloWorldBean [messsage=" + messsage + "]";
	}
}
