package com.tej.Springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tej.Springdemo.model.User;


@Controller
public class SignupController {
	
	@GetMapping("/signup")
	public String SignupController() {
		
		return "Signup";
	}

	@PostMapping("/signup")
	public String postSignup (@ModelAttribute User user, Model model) {
		        
        model.addAttribute("fname",user.getFname());
        model.addAttribute("lname",user.getLname());
        model.addAttribute("uname",user.getUsername());		
        model.addAttribute("Age",user.getAge());
		model.addAttribute("success"," <<--Account Created Success-->>");
		
		return "Profile";
	}
	
}
