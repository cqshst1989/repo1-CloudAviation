package com.taoji666.maintenance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class MaintenanceMain {
    public static void main(String[] args) {
        SpringApplication.run(MaintenanceMain.class, args);
    }


}
