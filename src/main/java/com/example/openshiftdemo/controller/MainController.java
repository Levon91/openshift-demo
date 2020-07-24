package com.example.openshiftdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private static long requestCount = 0;

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/")
    public String home() {
        ++requestCount;
        return "Hello im " + appName + " server, handled requests " + requestCount + " times";
    }
}
