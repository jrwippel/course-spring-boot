package com.estudojava.course.config;

import com.estudojava.course.entities.Order;
import com.estudojava.course.entities.User;
import com.estudojava.course.entities.enums.OrderStatus;
import com.estudojava.course.repositories.OrderRepository;
import com.estudojava.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.ArrayList;
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
        User u1 = new User(null, "James Bond", "james.bond@mi6.com.uk", "988888888", "007007");
        User u2 = new User(null, "Jack Reacher", "jack.reacher@cia.com.us", "977777777", "180947");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT,u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
