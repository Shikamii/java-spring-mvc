package com.ducna1.learnspring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ducna1.learnspring.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  User save(User eric);
} 
