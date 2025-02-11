package com.ducna1.learnspring.controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ducna1.learnspring.service.UserService;

@Controller
public class UserController {
  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping("/")
  public String getHomePage() {
    String test = this.userService.handleHello();
    return "eric.html";
  }
}
// @RestController
// public class UserController {

// private UserService userService;

// // hàm khởi tạo của UserController với tham số là userService (được Spring
// Boot
// // tự động inject vào)
// // và gán cho userService của UserController bằng userService được inject vào
// đó
// public UserController(UserService userService) {
// this.userService = userService;
// }

// @GetMapping("/")
// public String getHomePage() {
// return this.userService.handleHello();
// }

// }
