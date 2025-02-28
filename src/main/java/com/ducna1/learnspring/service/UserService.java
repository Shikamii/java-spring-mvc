package com.ducna1.learnspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ducna1.learnspring.domain.User;
import com.ducna1.learnspring.repository.UserRepository;

@Service
public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User handleSaveUser(User user) {
    User newUser = this.userRepository.save(user);
    System.out.println("New user: " + newUser);
    return this.userRepository.save(user);
  }

  public void updateUser(User user) {
    this.userRepository.save(user);
  }

  public List<User> getAllUsers() {
    return this.userRepository.findAll();
  }

  public User getUserById(long id) {
    Optional<User> user = this.userRepository.findById(id);
    if (user.isPresent()) {
      return user.get();
    }
    return null;
  }

  public List<User> getUserByEmail(String email) {
    return this.userRepository.findByEmail(email);
  }
}
