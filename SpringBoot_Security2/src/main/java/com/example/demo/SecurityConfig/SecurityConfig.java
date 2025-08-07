package com.example.demo.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SecurityConfig {

	@Bean
	public UserDetailsService detailsService() {
	    InMemoryUserDetailsManager detailsManager = new InMemoryUserDetailsManager();

	    UserDetails userDetails = User.withUsername("bablu")
	                                  .password("bablu") // removed {noop}
	                                  .roles("USER")
	                                  .build();

	    detailsManager.createUser(userDetails);

	    return detailsManager;
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
	    return NoOpPasswordEncoder.getInstance(); // OK for dev/testing
	}


  

    //  This bean controls what is secure and what is public
	//here one pronblem is there that is jab jab /secure pe ja rhe h mean request to form nho open ho rha h direct open ho ja rha h 
	// mai chah rha hu jaise  hi new tab me /secure again hit kare to phir se  from open ho jaye 
	//and 
	
	
//	
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
//    {
//    	
//    	System.out.println("This is Request path hitted by user:"+http.toString());
//        http
//            .authorizeHttpRequests(auth -> auth
//                .requestMatchers("/").permitAll()
//                .anyRequest().authenticated()
//            )
//            .formLogin(); // ← just use default login
//
//        return http.build();
//    }
//    
//    
	
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

	    http
	        .authorizeHttpRequests(auth -> auth
	            .requestMatchers("/").permitAll()
	            .anyRequest().authenticated()
	        )
	        .formLogin()
	        .and()
	        .logout()
	        .and()
	        .sessionManagement()
	            .invalidSessionUrl("/session-expired") // 🔴 important!
	            .maximumSessions(1); // optional: restrict concurrent sessions

	    return http.build();
	}



}
