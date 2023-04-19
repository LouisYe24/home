package com.louis.home.husband.webapi;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubbo
@SpringBootApplication
public class HomeHusbandWebapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeHusbandWebapiApplication.class, args);
    }

}
