package com.ducna1.learnspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ducna1.learnspring.domain.User;
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
    model.addAttribute("newUser", new User());
    return "admin/user/create";
  }

  @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
  public String createUserPage(Model model, @ModelAttribute("newUser") User hoidanit) {
    System.out.println("Create user      " + hoidanit);
    return "hello";
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
