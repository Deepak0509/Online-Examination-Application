package com.examportalbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examportalbackend.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByUseremail(String useremail);
}
