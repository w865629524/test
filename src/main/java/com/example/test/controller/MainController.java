package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class MainController {
    @GetMapping({"/", "/**"})
    @ResponseBody
    public String index() {
        return "hello world";
    }
}
