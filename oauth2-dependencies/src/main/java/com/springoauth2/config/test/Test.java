package com.springoauth2.config.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by zhang_htao on 2019/10/9.
 */
public class Test {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String client = bCryptPasswordEncoder.encode("client");
        System.out.println(client);
    }
}
