package com.security.springSecurity.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(HttpServletRequest request) {
        return "Hello Bineet ! How are you........." + request.getSession().getId();
    }
}
