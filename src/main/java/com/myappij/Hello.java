package com.myappij;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/hello")
    public String seyHello() {

        return "Hello from appdeveloper in inelj";
    }


}
