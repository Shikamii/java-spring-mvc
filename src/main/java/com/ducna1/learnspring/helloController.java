package com.ducna1.learnspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @GetMapping("/")
    public String index() {
        return "Hello, DucNA1";
    }

    @GetMapping("/user")
    public String userPage() {
        return "Only user can assess this page";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Only admin can assess this page";
    }
}
