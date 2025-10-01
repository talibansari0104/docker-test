package com.docker_test.docker;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String sayHello(){
        return "hello My friend i missing you a lot of my friend !! i hope we will meet you soon bro>>>>>>.....";
    }
}
