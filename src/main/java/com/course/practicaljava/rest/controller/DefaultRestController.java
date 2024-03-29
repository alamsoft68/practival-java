package com.course.practicaljava.rest.controller;

import java.time.LocalTime;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DefaultRestController {

	Logger log = LoggerFactory.getLogger(DefaultRestController.class);
	
	//Specifically, @GetMapping is a composed annotation thatacts as a shortcut for @RequestMapping(method = RequestMethod.GET).
	@GetMapping("/welcome")
	public String welcome() {
		log.info(StringUtils.join("Hello ","This is ","Spring Boot"," Rest API"));
		
		return "Welcome to Spring Boot";
	}
	
	@GetMapping("/time")
	public String time() {
		
		return LocalTime.now().toString();
	}
}
