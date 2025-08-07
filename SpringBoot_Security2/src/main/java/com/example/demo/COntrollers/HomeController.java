package com.example.demo.COntrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
    	System.out.println("HomeController.home()");
        return "Welcome to the Home Page!";
    }

    @GetMapping("/secure")
    public String secure() {
    	System.out.println("HomeController.secure()");
        return "You are viewing a secured page!";
    }
}
