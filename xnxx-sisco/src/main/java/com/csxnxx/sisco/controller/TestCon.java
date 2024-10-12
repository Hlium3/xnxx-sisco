package com.csxnxx.sisco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sisco/test")
public class TestCon {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
