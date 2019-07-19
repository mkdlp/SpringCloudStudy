package com.mkdlp.eurekaproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(@RequestParam("name")String name){
        String hello=name+" welcome to eureka-server!";
        return hello;
    }
}
