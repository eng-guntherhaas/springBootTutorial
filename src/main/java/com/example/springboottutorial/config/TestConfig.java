package com.example.springboottutorial.config;

import com.example.springboottutorial.entities.Order;
import com.example.springboottutorial.entities.User;
import com.example.springboottutorial.repositories.OrderRepository;
import com.example.springboottutorial.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Miles Davis", "miles@gmail.com", "99889988", "12345");
        User u2 = new User(null, "John Coltrane", "coltrane@gmail.com", "88999889", "54321");

        Order o1 = new Order(null, Instant.parse("2022-08-22T20:23:12Z"), u1);
        Order o2 = new Order(null, Instant.parse("2022-07-21T12:32:43Z"), u2);
        Order o3 = new Order(null, Instant.parse("2022-07-21T16:52:22Z"), u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
