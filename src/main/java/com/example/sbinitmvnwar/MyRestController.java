package com.example.sbinitmvnwar;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.apache.commons.logging.LogFactory;
import org.springframework.boot.context.logging.LoggingApplicationListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

@RestController
public class MyRestController {

	@GetMapping("/test")
	public String test() {
		return "SKtest 1";
	}
	

	@GetMapping("/test2")
	public String test2() {
		return "SKtesting 2 nono";
	}


	@GetMapping("/test3")
	public String test3() {
		return "SKtesting 3";
	}
	
	public void notUsed(ServletContext servletContext) throws ServletException {
		System.out.println("SKSK: notUsed");
	}

}
