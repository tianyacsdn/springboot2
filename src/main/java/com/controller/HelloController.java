package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * className:HelloController
 * classDescription: test controller
 * @author tom
 * @date 2018-10-10
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        System.out.println("------------------");
        return "hello world ! Spring Boot 2.0.5";
    }
}
