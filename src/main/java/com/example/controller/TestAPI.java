package com.example.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@RestController
public class TestAPI {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestAPI.class);
	

	
	@PostMapping(path = "/user/signin", produces="application/json")
    public String doSignin(@RequestHeader HttpHeaders Header, @RequestBody String Body){
		
		LOGGER.info("Post /user/signin method reached successfully");
		
		System.out.println(Header + "\n" + Body);

		// do something
		return "String/Json/Object";
		
	}
	

	@GetMapping(path = "/user/invite", produces="application/json")
    public String doReInvite(@RequestHeader HttpHeaders Header){
		
		LOGGER.info("Get /user/invite method reached successfully");
		
		System.out.println(Header);

		// do something
		return "String/Json/Object";
	}
	

	
	

	@PutMapping(path = "/user/signup", produces="application/json")
    public String doConfirmUser(@RequestHeader HttpHeaders Header, @RequestBody String Body){
		
		LOGGER.info("Put /user/signup method reached successfully");
		
		System.out.println(Header + "\n" + Body);
		
		// do something
		return "String/Json/Object";
	}
	

	

	
	@DeleteMapping(path = "/user", produces="application/json")
    public String doDelete(@RequestHeader HttpHeaders Header, @RequestBody String Body){
		
		LOGGER.info("Delete /user/delete method reached successfully");
		
		System.out.println(Header + "\n" + Body);
		
		// do something
		return "String/Json/Object";
		
	}

	
}