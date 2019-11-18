package com.qust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.qust"})
public class ConsumerFeign_APP {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeign_APP.class,args);
    }
}
