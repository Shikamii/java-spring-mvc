package com.ducna1.learnspring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ducna1.learnspring.domain.User;
import com.ducna1.learnspring.repository.UserRepository;
import com.ducna1.learnspring.service.UserService;

@Controller
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping("/")
  public String getHomePage(Model model) {
    model.addAttribute("eric", "test");
    model.addAttribute("name", "DucNA1 from Hblab");

    List<User> users = this.userService.getAllUsers();
    System.out.println("Users: " + users);

    List<User> usersByEmail = this.userService.getUserByEmail("1@gmail.com");
    System.out.println("Users by email: " + usersByEmail);

    return "hello";
  }

  @RequestMapping("/admin/user")
  public String getUserPage(Model model) {
    return "admin/user/table-user"; // trang hiển thị danh sách user
  }

  @RequestMapping("/admin/user/create") // get
  public String getCreateUserPage(Model model) { // lấy trang tạo mới user
    model.addAttribute("newUser", new User()); // tạo một đối tượng User mới để binding với form
    return "admin/user/create"; // form tạo mới user
  }

  // khi submit form -> lời gọi đến đây
  @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
  public String createUserPage(Model model, @ModelAttribute("newUser") User hoidanit) {
    System.out.println("Create user      " + hoidanit);
    this.userService.handleSaveUser(hoidanit);
    return "hello";
  }
}

// viet theo mô hình restAPI
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
