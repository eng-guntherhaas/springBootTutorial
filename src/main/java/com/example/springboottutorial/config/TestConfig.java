package com.example.springboottutorial.config;

import com.example.springboottutorial.entities.User;
import com.example.springboottutorial.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Miles Davis", "miles@gmail.com", "99889988", "12345");
        User u2 = new User(null, "John Coltrane", "coltrane@gmail.com", "88999889", "54321");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
