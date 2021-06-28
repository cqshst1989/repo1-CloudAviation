package com.taoji666.maintenjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class MaintenJobMain {
    public static void main(String[] args) {
        SpringApplication.run(MaintenJobMain.class, args);
    }


}
