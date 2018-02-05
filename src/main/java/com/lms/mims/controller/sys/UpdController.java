package com.lms.mims.controller.sys;

import com.lms.mims.domain.DateResultSet;
import com.lms.mims.domain.sys.Upd;
import com.lms.mims.service.sys.UpdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 更新日志
 */
@RestController
@RequestMapping("/upd")
public class UpdController {

    @Autowired
    private UpdService updService;

    /**
     * 获取所有
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<DateResultSet<Upd>> getAll() {
        return this.updService.getAll();
    }

    /**
     * 获取最新的数据
     * @return
     */
    @RequestMapping(value = "/get/max", method = RequestMethod.GET)
    public Upd getMaxId() {
        return this.updService.queryMaxId();
    }

    /**
     * 新增
     * @param upd
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(Upd upd) {
        return this.updService.add(upd);
    }
}
