package com.sky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class IndexController {

    @RequestMapping("/test")
    public  String test(Model model){
        model.addAttribute("msg","hello,springboot");

        model.addAttribute("users", Arrays.asList("sky","zyq"));
        return "test";

    }

}
