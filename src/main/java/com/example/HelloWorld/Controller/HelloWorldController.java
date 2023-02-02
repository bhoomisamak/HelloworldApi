package com.example.HelloWorld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/home")
    public String printHello()
    {
        return "Hello World!";
    }
}
