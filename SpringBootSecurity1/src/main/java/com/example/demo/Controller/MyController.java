package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class MyController {

//	
//	@GetMapping("/")
//	public String greet()
//	{
//		return "Welcome to Safar e Engineer";
//		
//	}
//	

	@GetMapping("/")
	public String greet1(HttpServletRequest req) {
		return "Welcome to Safar e Engineer" + req.getSession().getId();

	}

}
