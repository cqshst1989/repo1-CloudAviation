package com.taoji666;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableDiscoveryClient  //nacos
@SpringBootApplication  //springboot应用
@EnableFeignClients   //微服务调用，服务降级
public class WelomeHome {
    public static void main(String[] args){
        SpringApplication.run(WelomeHome.class, args);
    }

}
