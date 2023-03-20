package com.demo.spring.session;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@Configuration
public class HttpSessionConfig {

    @Bean
    public HttpSessionListener httpSessionListener() {
        return new HttpSessionListener() {
            @Override
            public void sessionCreated(HttpSessionEvent hse) {
                System.out.println(">>>> Session Created: " + hse.getSession());
            }

            @Override
            public void sessionDestroyed(HttpSessionEvent hse) {
                System.out.println(">>>> Session destroyed: " + hse.getSession());
            }
        };
    }
}
