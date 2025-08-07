package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	
	private List<Student> students= new ArrayList<>(List.of(new Student(1,"Bablu"), new Student(2, "Kundan")));
	
	@GetMapping("getStudents")
	public List<Student> getall()
	{
		
		System.out.println("StudentController.getall()");
		return students;
	}
	
	
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student)
	{
		System.out.println("StudentController.addStudent()");
		
		students.add(student);
		return student;
		
	}
}
