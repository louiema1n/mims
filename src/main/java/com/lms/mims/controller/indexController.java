package com.lms.mims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping("/index")
    public String test() {
        return "index";
    }

    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/itemList")
    public String itemList() {
        return "work/item/itemList";
    }

    @RequestMapping("/itemHandle")
    public String itemHandle() {
        return "work/item/itemHandle";
    }

    @RequestMapping("/addItem")
    public String addItem() {
        return "work/item/addItem";
    }

    @RequestMapping("/prjList")
    public String prjList() {
        return "work/project/prjList";
    }

    @RequestMapping("/rewList")
    public String rewList() {
        return "work/review/rewList";
    }

    @RequestMapping("/addRew")
    public String addRew() {
        return "work/review/addRew";
    }

    @RequestMapping("/sfeList")
    public String sfeList() {
        return "work/selfexam/sfeList";
    }

    @RequestMapping("/addSfe")
    public String addSfe() {
        return "work/selfexam/addSfe";
    }

    @RequestMapping("/exam")
    public String exam() {
        return "work/selfexam/exam";
    }

    @RequestMapping("/updLog")
    public String updLog() {
        return "sys/upd/updLog";
    }

    @RequestMapping("/addUpd")
    public String addUpd() {
        return "sys/upd/addUpd";
    }
}
