package com.nichiporenko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class Application extends SpringBootServletInitializer /*implements AppShellConfigurator*/ {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
