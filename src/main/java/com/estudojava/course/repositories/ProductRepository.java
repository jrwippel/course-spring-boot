package com.estudojava.course.repositories;

import com.estudojava.course.entities.Product;
import com.estudojava.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
