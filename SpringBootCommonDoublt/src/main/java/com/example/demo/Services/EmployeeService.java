package com.example.demo.Services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class EmployeeService {
    public EmployeeService() {
        System.out.println("EmployeeService Constructor Called");
    }

    public void doWork() {
        System.out.println("Work Done");
    }
}
