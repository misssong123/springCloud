package com.qust.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class DeptProviderHystrix8001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix8001_App.class,args);
    }
}
