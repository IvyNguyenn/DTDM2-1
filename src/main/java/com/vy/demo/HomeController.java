package com.vy.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private String message = "Hello Spring Boot !!!";
	@RequestMapping("/")
	public String hello(Map<String,Object> model) {
		model.put("message", this.message);
		return "index";
	}
	
}
