package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author tanht
 * @create 2020-01-05 17:27
 */
@Configuration
public class ApplicationContextConfig
{
    @Bean
    @LoadBalanced //开启负载均衡功能，否则请求地址直接写服务名，不知道请求具体哪台机器
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
//applicationContext.xml <bean id="" class="">
