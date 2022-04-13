package com.tej.Springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.tej.Springdemo.model.User;

@Controller
public class loginController {
	
    //@RequestMapping(value = "/login", method = RequestMethod.GET) (Shortcut -tala ko tag ho)
	@GetMapping("/login")
	public String showloginForm () {
		
		return "loginForm";
	}
    
	@PostMapping("/login")
	public String postLogin(@ModelAttribute User user, Model model) {
		
		if(user.getUsername().equals("Tej")&& user.getPassword().equals("1234"))  {
			
			model.addAttribute("uname",user.getUsername());	
			return "Home";
		}
		model.addAttribute("message","User NOt Found !!");
		return "loginForm";
	}
	
	
}
