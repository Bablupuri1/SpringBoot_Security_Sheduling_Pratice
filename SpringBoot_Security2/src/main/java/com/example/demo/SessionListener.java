package com.example.demo;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;
import org.springframework.stereotype.Component;

@Component
public class SessionListener implements HttpSessionListener {

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("⚠️ Session expired at: " + java.time.LocalTime.now());
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("✅ Session created at: " + java.time.LocalTime.now());
    }
}
