package com.ray.userservicefeign.service;

import com.ray.basicinfo.domain.User;
import com.ray.userservicefeign.hystric.UserServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "user-server-client",fallback = UserServiceHystric.class)
public interface UserService {
     @RequestMapping(value = "/user/getAllUser",method = RequestMethod.GET)
     List<User> getAllUser();
}
