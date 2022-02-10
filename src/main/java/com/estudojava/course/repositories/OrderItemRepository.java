package com.estudojava.course.repositories;

import com.estudojava.course.entities.OrderItem;
import com.estudojava.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
