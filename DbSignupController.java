package com.tej.Springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tej.Springdemo.model.DbUser;
import com.tej.Springdemo.repo.DbuserRepository;

@Controller
public class DbSignupController {

	@Autowired
	private DbuserRepository userRepo;
	
	
	@GetMapping("/dbsignup")
	public String getSignup() {
		
		return "DbSignup";
	}
	
	@PostMapping("/dbsignup")
	public String postSignup(@ModelAttribute DbUser User) {
		
	  userRepo.save(User);
		
		return "DBLogin";
	}
}
