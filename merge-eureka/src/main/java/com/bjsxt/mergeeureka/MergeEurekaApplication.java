package com.bjsxt.mergeeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MergeEurekaApplication {

    public static void main(String[] args) {
        System.out.println("--");
        SpringApplication.run(MergeEurekaApplication.class, args);
    }

}
