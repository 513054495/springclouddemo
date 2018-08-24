package com.ray.userserverclient.server.impl;

import com.ray.basicinfo.domain.User;
import com.ray.userserverclient.server.UserServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServerImpl implements UserServer {

    @Value("${server.port}")
    private String port;

    @Override
    public List<User> getAllUser() {
        User user =new User();
        user.setId(port);
        user.setName("Ray");
        List<User> users=new ArrayList<>();
        users.add(user);
        return users ;
    }
}
