package com.lms.mims.controller.work;

import com.lms.mims.domain.work.Standard;
import com.lms.mims.service.work.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 标准控制器
 */
@RestController
@RequestMapping("/std")
public class StandardController {

    @Autowired
    private StandardService standardService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Standard> getAll() {
        return this.standardService.queryAll();
    }

    /**
     * 根据id查询
     * @param stdid
     * @return
     */
    @RequestMapping(value = "/get/{stdid}", method = RequestMethod.GET)
    public Standard getById(int stdid) {
        return this.standardService.queryById(stdid);
    }
}