package com.wise.dubbo.consumer.controller;

import com.wise.dubbo.api.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return helloService.hello("Dubbo!");
    }

}
