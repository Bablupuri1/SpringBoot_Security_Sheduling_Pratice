package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.EmployeeService;

@RestController
public class MainController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/test")
    public String test() 
    {
    	
    	System.out.println("MainController.test()");
    	
        // Lazy bean created yaha hoga
        employeeService.doWork();
        return "done";
    }
}
