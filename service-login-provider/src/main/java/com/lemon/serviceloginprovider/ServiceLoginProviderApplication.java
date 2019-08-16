package com.lemon.serviceloginprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceLoginProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceLoginProviderApplication.class, args);
    }

}
