package com.estudojava.course.config;

import com.estudojava.course.entities.User;
import com.estudojava.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "James Bond", "james.bond@mi6.com.uk", "988888888", "007007");
        User u2 = new User(null, "Jack Reacher", "jack.reacher@cia.com.us", "977777777", "180947");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
