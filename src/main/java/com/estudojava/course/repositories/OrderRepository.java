package com.estudojava.course.repositories;

import com.estudojava.course.entities.Order;
import com.estudojava.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
