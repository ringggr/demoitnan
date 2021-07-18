package com.ringggr.demoitnan.controller;


import com.ringggr.demoitnan.entity.User;
import com.ringggr.demoitnan.entity.Vip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {


    @Resource
    private User user;

    @Resource
    private Vip vip;

    @Value("${username}")
    private String name;

    @GetMapping("hello")
    public String hello() {
        System.out.println(vip);
        return user.getName();
    }

}
