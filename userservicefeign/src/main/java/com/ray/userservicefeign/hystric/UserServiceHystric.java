package com.ray.userservicefeign.hystric;

import com.ray.basicinfo.domain.User;
import com.ray.userservicefeign.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceHystric implements UserService {
    @Override
    public List<User> getAllUser() {
        List<User> list=new ArrayList<>();
        User user=new User();
        user.setId("0");
        user.setName("对不起，服务已挂，请稍后重试");
        list.add(user);
        return list;
    }
}
