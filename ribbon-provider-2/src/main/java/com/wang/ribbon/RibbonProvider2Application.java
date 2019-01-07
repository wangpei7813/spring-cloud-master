package com.wang.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RibbonProvider2Application {

	public static void main(String[] args) {
		SpringApplication.run(RibbonProvider2Application.class, args);
	}

}

