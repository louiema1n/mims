package com.lms.mims.controller;

import com.lms.mims.domain.ResultSet;
import com.lms.mims.domain.Secareview;
import com.lms.mims.service.SecareviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Secareview控制器
 */
@RestController
@RequestMapping("/sar")
public class SecareviewController {

    @Autowired
    private SecareviewService secareviewService;

    /**
     * 获取所有Secareview
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResultSet<Secareview> getAll() {
        ResultSet<Secareview> sarResultSet = new ResultSet<>();
        sarResultSet.setCode(0);
        sarResultSet.setMsg("查询成功");
        sarResultSet.setCount(this.secareviewService.queryAll().size());
        sarResultSet.setData(this.secareviewService.queryAll());
        return sarResultSet;
    }
}
