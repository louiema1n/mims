package com.lms.mims.controller.study;

import com.lms.mims.domain.study.syllabus.BLCJExam;
import com.lms.mims.service.study.BLCJExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author&date Created by louiemain on 2018-01-23 9:49
 */
@RestController
@RequestMapping("/blcj")
public class BLCJExamController {

    @Autowired
    private BLCJExamService blcjExamService;

    /**
     * @description 根据id查询
     * @author louiemain
     * @date Created on 2018-01-23 9:50
     * @param id
     * @return com.lms.mims.domain.study.syllabus.BLCJExam
     */
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public BLCJExam getById(@PathVariable int id) {
        return this.blcjExamService.queryById(id);
    }
}
