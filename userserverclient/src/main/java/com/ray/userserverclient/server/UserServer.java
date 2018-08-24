package com.ray.userserverclient.server;


import com.ray.basicinfo.domain.User;

import java.util.List;

public interface UserServer {

    List<User> getAllUser();
}
