package com.ducna1.learnspring.service;

import org.springframework.stereotype.Service;

import com.ducna1.learnspring.domain.User;
import com.ducna1.learnspring.repository.UserRepository;

@Service
public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User handleSaveUser(User user){
    return this.userRepository.save(user);
  }

}
