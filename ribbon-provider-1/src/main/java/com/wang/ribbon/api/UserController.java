package com.wang.ribbon.api;

import com.wang.ribbon.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wp
 * @date 2019/1/7 10:11
 */
@RestController
@Slf4j
public class UserController {

    private int count = 0;

    @GetMapping("/get-user")
    public User getUser(String id) {

        log.info("---------- provider-1 ---------- id = {}", id);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        System.out.println(count);

        return new User(id, "provider-1-"+ count);
    }
}
