package com.ducna1.learnspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ducna1.learnspring.domain.User;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  User save(User eric);
  List<User> findByEmail(String email);
} 
