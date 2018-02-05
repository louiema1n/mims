package com.lms.mims.controller.sys;

import com.lms.mims.domain.sys.Sysnav;
import com.lms.mims.service.sys.NavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description 系统导航
 * @author&date Created by louiemain on 2018-01-10 10:15
 */
@RestController
@RequestMapping("/nav")
public class NavController {

    @Autowired
    private NavService navService;

    /**
     * @description 查询所有
     * @author louiemain
     * @date Created on 2018-01-10 10:16
     * @param
     * @return java.util.List<com.lms.mims.domain.sys.Nav>
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Sysnav> getAll() {
        return this.navService.queryAll();
    }

    /**
     * @description 查询所有2级nav
     * @author louiemain
     * @date Created on 2018-01-10 16:04
     * @param
     * @return java.util.List<com.lms.mims.domain.sys.Nav>
     */
    @RequestMapping(value = "/2nav", method = RequestMethod.GET)
    public List<Sysnav> get2Nav() {
        return this.navService.query2Nav();
    }
}
