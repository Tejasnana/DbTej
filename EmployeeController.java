package com.tej.Springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tej.Springdemo.model.Employee;
import com.tej.Springdemo.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employee")
	public String getEmployee() {
	
		return "EmployeeForm";
	}
	
	@PostMapping("/employee")
	public String saveEmployee(@ModelAttribute Employee employee) {
		
		service.addEmp(employee);
		
		return "EmployeeForm";
		
	}
}
