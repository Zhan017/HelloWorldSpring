package com.springdemo.hellow;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWController {
    @RequestMapping
    public String helloWorld(){
        return "Hello World From Spring Boot";
    }
    @RequestMapping("/goodbye")
    public String goodbye() {
        return "Goodbye from Spring Boot";
    }
}
