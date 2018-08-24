package com.ray.userserviceribbon.server;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ray.basicinfo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "userError")
    public List<User> getAllUser(){
        List<User> list=restTemplate.getForObject("http://USER-SERVER-CLIENT/user/getAllUser",List.class);
        return list;
    }

    public List<User> userError(){
        List<User> list=new ArrayList<>();
        User user=new User();
        user.setId("0");
        user.setName("对不起，服务挂了，请稍后重试");
        list.add(user);
        return list;
    }
}
