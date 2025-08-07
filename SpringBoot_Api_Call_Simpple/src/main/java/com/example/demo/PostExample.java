package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Bean.Post;

@Component
public class PostExample {

    @Autowired
    RestTemplate restTemplate;

    public void postApiCall() {
        String url = "https://jsonplaceholder.typicode.com/posts";

        
        
        // Create a dummy post body
        Post newPost = new Post();
        newPost.setUserId(1);
        newPost.setTitle("Dream Big");
        newPost.setBody("Work hard, stay consistent.");

        HttpEntity<Post> request = new HttpEntity<>(newPost);
        System.out.println("Wait  untill post is not complate.............");


        Post response = restTemplate.postForObject(url, request, Post.class);
        System.out.println("Wait  untill post is not complate");

        System.out.println("Response from API:");
        System.out.println("ID: " + response.getId());
        System.out.println("Title: " + response.getTitle());
        System.out.println("Body: " + response.getBody());
    }
}
