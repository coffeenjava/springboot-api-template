package com.template.myapi.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String name) {
        String hello = "hello ";
        if (StringUtils.hasText(name)) {
            return hello + name;
        }
        return hello + "what's your name?";
    }
}
