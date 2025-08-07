package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootApiCallSimppleApplication {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiCallSimppleApplication.class, args);

		// ________This is Get______________________________

//		// Use this URL for SINGLE quote
//		String url = "https://dummyjson.com/quotes/random";
//
//		RestTemplate restTemplate = new RestTemplate();
//		Quote quote = restTemplate.getForObject(url, Quote.class);
//
//		// Print result
//		System.out.println("Quote of the Day:");
//		System.out.println("\"" + quote.getQuote() + "\"");
//		System.out.println("- " + quote.getAuthor());

		// ___________________How we can send the post request to the
		// RestTemplate______________

	}
}
