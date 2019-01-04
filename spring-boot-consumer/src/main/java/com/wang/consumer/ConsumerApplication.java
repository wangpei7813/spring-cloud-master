package com.wang.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient    //标识具体的一个服务,需要向注册中心注册
@SpringBootApplication
@EnableAutoConfiguration
public class ConsumerApplication {

	@Bean
	@LoadBalanced  // 如果加了这个注解 , 那么就说明 具有了服务发现的特性 负载均和的机制
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

}

