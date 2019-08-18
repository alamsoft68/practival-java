package com.course.practicaljava;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication	//Spring will do automatic configuration
public class PracticalJavaApplication extends SpringBootServletInitializer{

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PracticalJavaApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PracticalJavaApplication.class, args);
	}
}
