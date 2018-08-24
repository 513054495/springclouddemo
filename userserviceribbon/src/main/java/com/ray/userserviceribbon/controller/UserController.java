package com.ray.userserviceribbon.controller;

import com.ray.basicinfo.domain.User;
import com.ray.userserviceribbon.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
    public List<User> hi() {
        return userService.getAllUser();
    }
}
