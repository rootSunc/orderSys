package com.csun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/order")
public class OrderHandler {


    @Value("${server.port}")
    private int port;

    @RequestMapping("/")
    public String index() {
        return "the port of module Menu is " + this.port;
    }
}
