package com.zeus.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ZeusMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeusMemberApplication.class, args);
    }

}
