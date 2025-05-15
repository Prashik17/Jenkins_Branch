package com.restcontroller.Basr.Restcontroller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemoRest {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello, World!";
    }

    @PostMapping("/echo")
    public String echoMessage(@RequestBody String message){
        return "You sent:" + message;
    }

}
