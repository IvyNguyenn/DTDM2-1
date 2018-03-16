package com.vy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vy.service.UserService;

@Controller
public class UserController {
	@Autowired
    private UserService userService;
	
	@GetMapping("/home")
    public String home() {
        return "index";
    }
    @GetMapping("/user")
    public String index(Model model, int id) {
        model.addAttribute("users", userService.findAll());
        return "test";
    }
    @GetMapping("/welcome")
    public String hello(Model model, int id) {
        model.addAttribute("users", userService.findAll());
        return "welcome";
    }
}
