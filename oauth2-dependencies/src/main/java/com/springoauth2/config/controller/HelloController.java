package com.springoauth2.config.controller;

import org.omg.CORBA.ServerRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhang_htao on 2019/10/1.
 */
@RestController
public class HelloController {
    @GetMapping(value = "test")
    public Object test(ServerRequest request){
        return "hello world";
    }
}
