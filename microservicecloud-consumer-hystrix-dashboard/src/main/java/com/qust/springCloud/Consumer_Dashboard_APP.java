package com.qust.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class Consumer_Dashboard_APP {
    public static void main(String[] args) {
        SpringApplication.run(Consumer_Dashboard_APP.class,args);
    }
}
