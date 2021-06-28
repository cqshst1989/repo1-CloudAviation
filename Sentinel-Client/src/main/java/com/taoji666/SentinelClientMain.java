package com.taoji666;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SentinelClientMain {
    public static void main(String[] args) {
        SpringApplication.run(SentinelClientMain.class, args);
    }

}
