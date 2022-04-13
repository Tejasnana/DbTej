package com.tej.Springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.tej.Springdemo.model.DbUser;
import com.tej.Springdemo.repo.DbuserRepository;

@Controller
public class  DbloginController {
	
	@Autowired
	private DbuserRepository userRepo;
	
    	@GetMapping("/dblogin")
	public String showDbLogin () {
		
		return "DbLogin";
	}
    
	@PostMapping("/dblogin")
	public String postLogin(@ModelAttribute DbUser user, Model model) {
		
		
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		
		DbUser usr = userRepo.FindByUsernameAndPassword(user.getUsername(),user.getPassword());
		
		if(usr !=null)  {
			
			model.addAttribute("uname",user.getUsername());
			
			return "Home";
		}
		
		model.addAttribute("message","User NOt Found !!");
		return "DbLogin";
	}
	
	
}