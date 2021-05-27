package com.tanht.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author:Tanht
 * @Description:
 * @Date:3:50 PM 1/4/2021
 * @version:1.0
 */

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Payment8001 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8001.class,args);
    }
}
