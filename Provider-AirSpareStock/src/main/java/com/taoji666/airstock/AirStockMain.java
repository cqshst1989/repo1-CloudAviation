package com.taoji666.airstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class AirStockMain {
    public static void main(String[] args) {
        SpringApplication.run(AirStockMain.class, args);
    }


}
