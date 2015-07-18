package com.lasgana.cx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ch594u on 8/30/14.
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String testView(Model model) {
        model.addAttribute("title", "My custom title");
        return "thymeleaf/users";
    }

}
