package com.yyz.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ZeusEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeusEurekaApplication.class, args);
    }

}
