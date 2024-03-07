package com.myApp.rest.webServices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	
	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("pavan kalyan");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionOfPerson() {
		return new PersonV2(new Name("pavan","kalyan"));
	}
	
	@GetMapping(path="/person" ,params="version=1")
	public PersonV1 getFirstVersionOfPersonRequestParameter() {
		return new PersonV1("pavan kalyan");
	}
	
	@GetMapping(path="/person" ,params="version=2")
	public PersonV2 getecondVersionOfPersonRequestParameter() {
		return new PersonV2(new Name("pavan","kalyan"));
	}
	
	@GetMapping(path="/person/header" ,headers="X-API-VERSION=1")
	public PersonV1 getFirstVersionOfPersonRequestHeader() {
		return new PersonV1("pavan kalyan");
	}
	
	@GetMapping(path="/person/header" ,headers="X-API-VERSION=2")
	public PersonV2 getecondVersionOfPersonRequestHeader() {
		return new PersonV2(new Name("pavan","kalyan"));
	}
	
	@GetMapping(path="/person/AcceptHeader" ,produces="application/vnd.company.app-v1+json")
	public PersonV1 getFirstVersionOfPersonAcceptHeader() {
		return new PersonV1("pavan kalyan");
	}
	
	@GetMapping(path="/person/AcceptHeader" ,produces="application/vnd.company.app-v2+json")
	public PersonV2 getecondVersionOfPersonAcceptHeader() {
		return new PersonV2(new Name("pavan","kalyan"));
	}
}
	
