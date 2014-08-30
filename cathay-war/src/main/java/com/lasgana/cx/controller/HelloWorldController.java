package com.lasgana.cx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ch594u on 8/30/14.
 */
@RestController
public class HelloWorldController {


    public HelloWorldController() {
        System.out.println("!!!!!!!init!!!!!!!");
    }


    @ResponseBody
    @RequestMapping("/")
    public String helloWorld()
    {
        return "Hello, World!";
    }
}
