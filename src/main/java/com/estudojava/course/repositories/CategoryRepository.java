package com.estudojava.course.repositories;

import com.estudojava.course.entities.Category;
import com.estudojava.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
