package com.wang.ribbon.api;

import com.wang.ribbon.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author wp
 * @date 2019/1/7 10:27
 */
@RestController
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("get")
    public User get() {
        ResponseEntity<User> response = restTemplate.getForEntity("http://ribbon-provider/get-user?id=001", User.class);
        return response.getBody();
    }
}
