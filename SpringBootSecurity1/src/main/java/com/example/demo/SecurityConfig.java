package com.example.demo;

// These are Spring Security classes used for authentication
import org.springframework.context.annotation.Bean; // To declare methods as Spring beans
import org.springframework.context.annotation.Configuration; // To declare a configuration class
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService; // Interface for user loading logic
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

// Marks this class as a Configuration class — like XML file replacement
@Configuration
public class SecurityConfig {

    // Constructor of this class, prints a message when object is created
	public SecurityConfig() {
		super();
		System.out.println("SecurityConfig.SecurityConfig()");
	}

    // This method defines a bean (object) for user details service
//	@Bean
//	public UserDetailsService detailsService() {
//		System.out.println("SecurityConfig.detailsService()");
//
//        // Create in-memory user manager
//		InMemoryUserDetailsManager detailsManager = new InMemoryUserDetailsManager();
//
//        // Create a user with username "natraj" and password "12345"
//		UserDetails userDetails = User.withUsername("natraj").password("12345").build();
//
//        // Add the user to memory manager
//		detailsManager.createUser(userDetails);
//
//        // Return the user manager object
//		return detailsManager;
//	}

    // This method creates a bean that returns a password encoder
    // Here, NoOpPasswordEncoder is used — no encryption (not secure, only for testing)
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
	
	
	
	
	@Bean
	public UserDetailsService detailsService()
	{
		//we need to create InMemoryUserDetailsManager to store username and password not from database
		
		InMemoryUserDetailsManager detailsManager= new InMemoryUserDetailsManager();
		//now we neeed to set the password and username manually then pass to inmemory for creating and store temporary
		
//		UserDetails userDetails = User.withUsername("bablu").password("{noop}bablu").build();
		
	UserDetails userDetails = User.withUsername("bablu").password("bablu").build();

		//now finally we can pass the userdetails to the inMomoryDetailsManager
		
		detailsManager.createUser(userDetails);
		
		return detailsManager;
		
		
		
		
	}
	
	//no we need to password must  be encodded but i am given normal text passsword so, we get error
	
	
	//solution 2
	
	// agar yha bhi and vha noon lga diya h to invalide crydentail ata h 
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return NoOpPasswordEncoder.getInstance();
	}

	
	
}
