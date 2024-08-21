package com.web.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
