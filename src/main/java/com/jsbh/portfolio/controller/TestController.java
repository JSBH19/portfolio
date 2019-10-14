package com.jsbh.portfolio.controller;

import com.jsbh.portfolio.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/test2")
    public String test2() {
        System.out.println("test2");

        int count = testService.countAllData();
        System.out.println("data는 " + count + "개 있습니다");
        //List<TestTable> result = testService.findDataByName("aaa");
        
        return "index";
    }
}