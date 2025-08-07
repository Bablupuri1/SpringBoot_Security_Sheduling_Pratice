package com.example.demo.Runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.PostExample;

@Component
public class PostRunner implements CommandLineRunner {

@Autowired
PostExample postExample;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		postExample.postApiCall();
		

	}

}
