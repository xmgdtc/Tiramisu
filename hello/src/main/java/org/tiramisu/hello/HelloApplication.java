package org.tiramisu.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class HelloApplication {


    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

    @RequestMapping("/index")
    public String hello() {
        return "hello";
    }

}