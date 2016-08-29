package com.jana.social.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginRestController {
	
	@RequestMapping("/")
	public String index(){
		return "Welcome to Spring Boot";
	}
	
	@RequestMapping("/login")
	public String login(){
		return "Login Redirection Comes here";
	}

}
