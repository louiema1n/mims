package com.lms.mims.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lms.mims.domain.study.syllabus.Ansrecord;
import com.lms.mims.domain.study.syllabus.Syllabus;
import com.lms.mims.service.study.AnsrecordService;
import com.lms.mims.utils.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@Controller
public class indexController {

    @Autowired
    private AnsrecordService ansrecordService;

    @RequestMapping("/test")
    public String test() {
        return "test";
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

    @RequestMapping("/mockExam")
    public String mockExam() {
        return "front/mockExam";
    }
    @RequestMapping("/exercisesChapter")
    public String exercisesChapter() {
        return "front/exercisesChapter";
    }
    @RequestMapping("/exercisesRandom")
    public String exercisesRandom() {
        return "front/exercisesRandom";
    }
    @RequestMapping("/examCatalog")
    public String examCatalog() {
        return "front/examCatalog";
    }

    @RequestMapping(value = "/ansReport/{type}/{time}/{ansid}")
    public String ansReport(Model model, HttpServletRequest request,
                            @PathVariable("type") String type,
                            @PathVariable("time") String time,
                            @PathVariable("ansid") String ansid) {
        model.addAttribute("type", type);
        model.addAttribute("time", time);
        model.addAttribute("ansid", ansid);
        model.addAttribute("anser", IpUtil.getIpAddr(request));

        List<Ansrecord> ansrecords = this.ansrecordService.getByAnsid(ansid);
        int right = 0, left = 0;
        for (Ansrecord a : ansrecords) {
            if (a.getSign() == 0) {
                left++;
            } else {
                right++;
            }
        }
        model.addAttribute("total", ansrecords.size());
        model.addAttribute("right", right);
        model.addAttribute("left", left);

        return "front/ansReport";
    }

    @RequestMapping("/ansReview/{ansid}/{flag}")
    public String ansReview(@PathVariable("ansid") String ansid, @PathVariable("flag") String flag, Model model) {
        List<Ansrecord> ansrecords = this.ansrecordService.getByAnsid(ansid);
        List<Ansrecord> dists = new LinkedList<>();
        switch (flag) {
            case "total":
                model.addAttribute("ansrecords", ansrecords);
                break;
            case "right":
                for (Ansrecord a : ansrecords) {
                    if (a.getSign() == 1) {
                        dists.add(a);
                    }
                }
                model.addAttribute("ansrecords", dists);
                break;
            case "left":
                for (Ansrecord a : ansrecords) {
                    if (a.getSign() == 0) {
                        dists.add(a);
                    }
                }
                model.addAttribute("ansrecords", dists);
                break;
        }
        return "front/ansReview";
    }

    @RequestMapping(value = "/showContent", method = RequestMethod.POST)
    public String showContent(String json, Model model) {
        try {
            // jsonstring转对象
            ObjectMapper om = new ObjectMapper();
            Syllabus syllabus = om.readValue(json, Syllabus.class);
            model.addAttribute("syllabus", syllabus);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "front/showContent";
    }

//    @RequestMapping(value = "/show", method = RequestMethod.POST)
//    public String show(String json, Model model) {
//        try {
//            // jsonstring转对象
//            ObjectMapper om = new ObjectMapper();
//            Syllabus syllabus = om.readValue(json, Syllabus.class);
//            model.addAttribute("syllabus", syllabus);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return "front/show";
//    }
}
