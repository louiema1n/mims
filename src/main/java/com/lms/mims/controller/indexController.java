package com.lms.mims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping("/index")
    public String test() {
        return "index";
    }

    @RequestMapping("/tmpList")
    public String tmpList() {
        return "tmp/tmpList";
    }
}
