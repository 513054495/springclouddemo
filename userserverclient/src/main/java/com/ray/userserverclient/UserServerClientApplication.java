package com.ray.userserverclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserServerClientApplication {
    public static void main(String[] args) {
        SpringApplication.run( UserServerClientApplication.class, args );
    }
}
