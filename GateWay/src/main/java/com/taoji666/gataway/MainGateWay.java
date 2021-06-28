package com.taoji666.gataway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class MainGateWay {
    public static void main(String[] args){
        SpringApplication.run(MainGateWay.class, args);
    }
}
