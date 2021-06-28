package com.taoji666.foc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class FocMain {
    public static void main(String[] args) {
        SpringApplication.run(FocMain.class, args);
    }


}
