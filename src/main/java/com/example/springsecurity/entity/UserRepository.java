package com.example.springsecurity.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
//interface là các method nguoi dung su dung
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);

}
