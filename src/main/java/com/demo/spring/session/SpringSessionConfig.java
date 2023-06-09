package com.demo.spring.session;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.MapSessionRepository;

import java.util.concurrent.ConcurrentHashMap;

@Configuration
//@EnableSpringHttpSession
public class SpringSessionConfig {

    public static ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap<>();

    //@Bean
    public MapSessionRepository sessionRepository() {
        MapSessionRepository mapSessionRepo = new MapSessionRepository(concurrentHashMap);
        mapSessionRepo.setDefaultMaxInactiveInterval(1800);
        return mapSessionRepo;
    }

}
