package com.lms.mims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping("/index")
    public String test() {
        return "back/index";
    }

    @RequestMapping("/main")
    public String main() {
        return "back/main";
    }

    @RequestMapping("/itemList")
    public String itemList() {
        return "back/work/item/itemList";
    }

    @RequestMapping("/itemHandle")
    public String itemHandle() {
        return "back/work/item/itemHandle";
    }

    @RequestMapping("/addItem")
    public String addItem() {
        return "back/work/item/addItem";
    }

    @RequestMapping("/delay")
    public String delay() {
        return "back/work/item/delay";
    }

    @RequestMapping("/prjList")
    public String prjList() {
        return "back/work/project/prjList";
    }

    @RequestMapping("/rewList")
    public String rewList() {
        return "back/work/review/rewList";
    }

    @RequestMapping("/addRew")
    public String addRew() {
        return "back/work/review/addRew";
    }

    @RequestMapping("/sfeList")
    public String sfeList() {
        return "back/work/selfexam/sfeList";
    }

    @RequestMapping("/addSfe")
    public String addSfe() {
        return "back/work/selfexam/addSfe";
    }

    @RequestMapping("/exam")
    public String exam() {
        return "back/work/selfexam/exam";
    }

    @RequestMapping("/updLog")
    public String updLog() {
        return "back/sys/upd/updLog";
    }

    @RequestMapping("/addUpd")
    public String addUpd() {
        return "back/sys/upd/addUpd";
    }

    @RequestMapping("/ecoList")
    public String ecoList() {
        return "back/life/economic/ecoList";
    }

    @RequestMapping("/addEco")
    public String addEco() {
        return "back/life/economic/addEco";
    }

    @RequestMapping("/docList")
    public String docList() {
        return "back/study/doc/docList";
    }

    @RequestMapping("/addDoc")
    public String addDoc() {
        return "back/study/doc/addDoc";
    }

    @RequestMapping("/sybList")
    public String sybList() {
        return "back/study/syllabus/sybList";
    }

    @RequestMapping("/catalogManage")
    public String catalogManage() {
        return "back/study/syllabus/catalogManage";
    }

    @RequestMapping("/addSyb")
    public String addSyb() {
        return "back/study/syllabus/addSyb";
    }

    @RequestMapping("/dictList")
    public String dictList() {
        return "back/sys/dict/dictList";
    }

    @RequestMapping("/home")
    public String home() {
        return "front/home";
    }

}
