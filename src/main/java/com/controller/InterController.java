package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
