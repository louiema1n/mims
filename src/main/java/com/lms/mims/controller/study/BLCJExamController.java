package com.lms.mims.controller.study;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lms.mims.domain.PageResult;
import com.lms.mims.domain.study.syllabus.BLCJExam;
import com.lms.mims.service.study.BLCJExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

    /**
     * @description 获取examCatalog
     * @author louiemain
     * @date Created on 2018-01-29 9:55
     * @param
     * @return java.lang.String
     */
    @RequestMapping(value = "/get/examCatalog", method = RequestMethod.GET)
    public String getExamCatalog() {
        return this.blcjExamService.getExamCatalog();
    }

    /**
     * @description 根据catalog分页查询
     * @author louiemain
     * @date Created on 2018-01-29 13:46
     * @param catalog
     * @param pageNum
     * @param pageSize
     * @return java.util.List<com.lms.mims.domain.study.syllabus.BLCJExam>
     */
    @RequestMapping(value = "/getTopicByCatalog/{catalog}/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public PageResult getTopicByCatalog(@PathVariable("catalog") String catalog,
                                        @PathVariable("pageNum") int pageNum,
                                        @PathVariable("pageSize") int pageSize) {

        PageResult pageResult = new PageResult();
        Page<Object> page = PageHelper.startPage(pageNum, pageSize, true);
        pageResult.setRows(this.blcjExamService.getTopicByCatalog(catalog));
        pageResult.setTotal(page.getTotal());
        pageResult.setPages(page.getPages());
        return pageResult;
    }

    /**
     * @description 获取考试题目
     * @author louiemain
     * @date Created on 2018-01-31 9:42
     * @param
     * @return java.util.List<com.lms.mims.domain.study.syllabus.BLCJExam>
     */
    @RequestMapping(value = "/getExamTopic", method = RequestMethod.GET)
    public List<BLCJExam> getExamTopic() {
        List<BLCJExam> blcjExams = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            blcjExams.add(this.blcjExamService.getRandOne());
        }
        return blcjExams;
    }

    /**
     * @description 根据search查询
     * @author louiemain
     * @date Created on 2018-01-31 16:22
     * @param search
     * @return java.util.List<com.lms.mims.domain.study.syllabus.BLCJExam>
     */
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public PageResult getBySearch(String search) {
        PageResult pageResult = new PageResult();
        Page page = PageHelper.startPage(1, 0, true);
        pageResult.setRows(this.blcjExamService.getBySearch(search));
        pageResult.setTotal(page.getTotal());
        pageResult.setPages(page.getPages());
        return pageResult;
    }
}
