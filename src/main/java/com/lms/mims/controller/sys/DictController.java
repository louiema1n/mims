package com.lms.mims.controller.sys;

import com.lms.mims.domain.sys.Dict;
import com.lms.mims.service.sys.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description 基础字典
 * @author&date Created by louiemain on 2018-01-10 16:34
 */
@RestController
@RequestMapping("/dict")
public class DictController {

    @Autowired
    private DictService dictService;

    /**
     * @description 查询所有
     * @author louiemain
     * @date Created on 2018-01-10 16:35
     * @param
     * @return java.util.List<com.lms.mims.domain.sys.Dict>
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Dict> getAll() {
        return this.dictService.queryAll();
    }
}
