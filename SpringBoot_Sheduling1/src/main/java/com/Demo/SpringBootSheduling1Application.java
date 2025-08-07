package com.Demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class SpringBootSheduling1Application {

	public static void main(String[] args) {
		System.out.println("Application Started....."+ new Date());

		SpringApplication.run(SpringBootSheduling1Application.class, args);


	}

}
