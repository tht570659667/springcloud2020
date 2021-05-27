package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:Tanht
 * @Description: 提供给tanht工程进行测试，通过tanht工程调用此接口来使用springCloud payment微服务
 * @Date:10:04 AM 1/7/2021
 * @version:1.0
 */

@RestController
@RequestMapping(value = "/springCloud")
public class CloudController {

    @Autowired
    RestTemplate restTemplate;

    /**
     * payment微服务在eureka名称
     */
    private static final String REQUEST_URL = "http://CLOUD-PAYMENT-SERVICE";

//    @RequestMapping(value = "queryPayment")
//    public CommonResult queryPayment(@RequestBody JSONObject requestParam){
//         return new CommonResult()
//    }
}
