package com.ducna1.learnspring.controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
  public String getHomePage(Model model) {
    String test = this.userService.handleHello();
    model.addAttribute("eric", test);
    model.addAttribute("name", "DucNA1 from Hblab");
    return "hello";
  }

  @RequestMapping("/admin/user")
  public String getUserPage(Model model) {
    String test = this.userService.handleHello();
    model.addAttribute("eric", test);
    model.addAttribute("name", "DucNA1 from Hblab");
    return "admin/user/create";
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
