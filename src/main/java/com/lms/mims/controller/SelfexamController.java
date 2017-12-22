package com.lms.mims.controller;

import com.lms.mims.domain.ResultSet;
import com.lms.mims.domain.Secareview;
import com.lms.mims.domain.Selfexam;
import com.lms.mims.service.SelfexamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Selfexam控制器
 */
@RestController
@RequestMapping("/sfe")
public class SelfexamController {

    @Autowired
    private SelfexamService selfexamService;

    /**
     * 获取所有Selfexam
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResultSet<Selfexam> getAll() {
        ResultSet<Selfexam> selfexamResultSet = new ResultSet<>();
        selfexamResultSet.setCode(0);
        selfexamResultSet.setMsg("查询成功");
        selfexamResultSet.setCount(this.selfexamService.queryAll().size());
        selfexamResultSet.setData(this.selfexamService.queryAll());
        return selfexamResultSet;
    }
}
