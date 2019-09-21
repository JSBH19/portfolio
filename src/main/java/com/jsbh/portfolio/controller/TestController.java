package com.jsbh.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test1")
    public String test1() {

        System.out.println("zzzzz");

        return "test1";

    }

    @RequestMapping("/test2")
    public String test2() {

        System.out.println("zzzzz");

        return "test1";

    }
}