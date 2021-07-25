package com.xjh.cloud.controller;

import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xujiahui
 * @create 2021/7/24 17:53
 * @Description
 */
@RestController
@RequestMapping("/xjh")
public class HelloWorldController {

    @Autowired
    private RedissonClient redissonClient;

    @GetMapping(value = "/hello")
    public String  hello() {
        RBucket<String> bu = redissonClient.getBucket("name");
        bu.set("hahaha");
        String message = "welcome to HangZhou, ";
        return message;
    }


}
