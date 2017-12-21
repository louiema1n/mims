package com.lms.mims.controller;

import com.lms.mims.domain.ResultSet;
import com.lms.mims.domain.Tmp;
import com.lms.mims.service.TmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * tmpitem控制器
 */
@RestController
@RequestMapping("/tmp")
public class TmpController {

    @Autowired
    private TmpService tmpService;

    /**
     * 获取所有tmpitem
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResultSet<Tmp> getAll() {
        ResultSet<Tmp> tmpResultSet = new ResultSet<>();
        tmpResultSet.setCode(0);
        tmpResultSet.setMsg("查询成功");
        tmpResultSet.setCount(this.tmpService.queryAll().size());
        tmpResultSet.setData(this.tmpService.queryAll());
        return tmpResultSet;
    }
}
