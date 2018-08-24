package com.ray.userserverclient.controller;

import com.ray.basicinfo.domain.User;
import com.ray.userserverclient.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServer userServer;


    @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
    public List<User> getAllUser(){
        return userServer.getAllUser();
    }
}
