package com.SpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//idhu oru Rest API aaaammmmm. 
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

}
