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

    @GetMapping("/get-user")
    public User getUser(String id) {
        log.info("---------- provider-2 ---------- id = {}", id);

        return new User(id, "provider-2");
    }
}
