package com.wang.consumer.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

	@Resource
	private RestTemplate restTemplate;
	
	
	@RequestMapping(value="/getByUrl")
	public String getByUrl(){
		
		RestTemplate rt1 = new RestTemplate();
		ResponseEntity<String> responseEntity = rt1.getForEntity("http://eureka-a:7001/index", String.class);
		String ret = responseEntity.getBody();
		System.err.println("返回provider服务调用结果: " + ret);
		return "----------get by url----------";
	}
	
	@RequestMapping(value="/getByServiceName")
	public String getByServiceName(){

		ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://eureka-provider-service/index", String.class);
		String ret = responseEntity.getBody();
		System.err.println("返回provider服务调用结果: " + ret);
		return "----------get by service name----------";
	}
	
}
