package com.lms.mims.controller.study;

import com.lms.mims.domain.ResultSet;
import com.lms.mims.domain.study.syllabus.Syllabus;
import com.lms.mims.service.study.SyllabusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description 大纲
 * @author&date Created by louiemain on 2018/1/12 19:42
 */
@RequestMapping("/syb")
@RestController
public class SyllabusController {

    @Autowired
    private SyllabusService syllabusService;

    /**
     * @description 查询所有
     * @author louiemain
     * @date Created on 2018/1/12 19:43
     * @param
     * @return java.util.List<com.lms.mims.domain.study.syllabus.Syllabus>
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResultSet<Syllabus> getAll() {
        List<Syllabus> syllabi = this.syllabusService.queryAll();
        ResultSet<Syllabus> resultSet = new ResultSet<>();
        resultSet.setCode(0);
        resultSet.setMsg("查询成功");
        resultSet.setCount(syllabi.size());
        resultSet.setData(syllabi);
        return resultSet;
    }

    /**
     * @description 获取目录
     * @author louiemain
     * @date Created on 2018/1/12 20:31
     * @param
     * @return java.lang.String
     */
    @RequestMapping(value = "/get/catalog", method = RequestMethod.GET)
    public String getCatalog() {
        return this.syllabusService.getCatalog();
    }

    /**
     * @description 修改目录
     * @author louiemain
     * @date Created on 2018/1/14 19:45
     * @param json
     * @return java.lang.String
     */
    @RequestMapping(value = "/catalog/upd", method = RequestMethod.POST)
    public String addCatalog(String json) {
        this.syllabusService.updCatalog(json);
        return "success";
    }

    /**
     * @description 新增
     * @author louiemain
     * @date Created on 2018-01-13 11:03
     * @param syllabus
     * @return java.lang.String
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(Syllabus syllabus) {
        return this.syllabusService.add(syllabus);
    }

    /**
     * @description 修改
     * @author louiemain
     * @date Created on 2018-01-13 11:02
     * @param syllabus
     * @return java.lang.String
     */
    @RequestMapping(value = "/upd", method = RequestMethod.POST)
    public String upd(Syllabus syllabus) {
        return this.syllabusService.upd(syllabus);
    }

    /**
     * @description 删除
     * @author louiemain
     * @date Created on 2018/1/14 12:13
     * @param id
     * @return java.lang.String
     */
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    public String del(@PathVariable int id) {
        Syllabus syllabus = new Syllabus();
        syllabus.setId(id);
        return this.syllabusService.del(syllabus);
    }

    /**
     * @description 根据search查询
     * @author louiemain
     * @date Created on 2018/1/15 21:42
     * @param search
     * @return java.util.List<com.lms.mims.domain.study.syllabus.Syllabus>
     */
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public List<Syllabus> getBySearch(String search) {
        return this.syllabusService.queryBySearch(search);
    }
}
