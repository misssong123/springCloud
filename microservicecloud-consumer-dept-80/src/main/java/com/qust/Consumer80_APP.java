package com.qust;

import com.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="microservicecloud-dept",configuration= MySelfRule.class)
public class Consumer80_APP {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80_APP.class,args);
    }
}
