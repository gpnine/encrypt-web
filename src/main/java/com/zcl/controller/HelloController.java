package com.zcl.controller;

import com.zcl.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.zcl.annotations.Decrypt;
import org.zcl.annotations.Encrypt;
import org.zcl.beans.RespBean;

/**
 * .
 *
 * @Author Chenglin Zhu
 * @Date 2021/7/30 9:54 下午
 */
@RestController
public class HelloController {
    @GetMapping("/user")
    @Encrypt
    public RespBean getUser() {
        User user = new User();
        user.setId((long) 99);
        user.setUsername("javaboy");
        return RespBean.ok("ok", user);
    }

    @PostMapping("/user")
    public RespBean addUser(@RequestBody @Decrypt User user) {
        System.out.println("user = " + user);
        return RespBean.ok("ok", user);
    }
}
