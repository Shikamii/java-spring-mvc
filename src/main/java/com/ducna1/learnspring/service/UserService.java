package com.ducna1.learnspring.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
  public String handleHello() {
    return "hello from service";
  }
}
