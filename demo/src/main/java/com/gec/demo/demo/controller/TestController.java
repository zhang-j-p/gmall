package com.gec.demo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/doTest")
    public String doTest(){
        return "hello wrold";
    }
}
