package com.tej.Springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//'Controller' is use for request processing
public class IndexController {

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String indexPage() {
		
		return "Dbindex";
	}
	
}
