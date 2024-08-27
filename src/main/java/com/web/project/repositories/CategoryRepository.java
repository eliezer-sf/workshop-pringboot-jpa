package com.web.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
