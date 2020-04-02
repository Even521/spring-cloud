package com.even;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.task.configuration.EnableTask;

@SpringBootApplication
@EnableTask
@EnableEurekaClient
public class SpringCloudTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudTaskApplication.class, args);
    }

}
