package com.examportalbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examportalbackend.models.Role;

public interface RoleRepository extends JpaRepository<Role, String> {
}
