package com.lms.mims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping("/index")
    public String test() {
        return "index";
    }

    @RequestMapping("/itemList")
    public String itemList() {
        return "item/itemList";
    }

    @RequestMapping("/addItem")
    public String addItem() {
        return "item/addItem";
    }

    @RequestMapping("/prjList")
    public String prjList() {
        return "project/prjList";
    }

    @RequestMapping("/sarList")
    public String sarList() {
        return "secareview/sarList";
    }

    @RequestMapping("/sfeList")
    public String sfeList() {
        return "selfexam/sfeList";
    }
}
