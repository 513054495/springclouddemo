package com.ray.userservicefeign.controller;

import com.ray.basicinfo.domain.User;
import com.ray.userservicefeign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
}
