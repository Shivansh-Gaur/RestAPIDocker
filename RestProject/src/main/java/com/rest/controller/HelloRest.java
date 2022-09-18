package com.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloRest {

	@GetMapping("/hellorest")
	public String hello(){
		return "Hii All!!...Welcome to Restful Application";
	}
}
