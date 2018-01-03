package com.lms.mims.controller.life;

import com.lms.mims.domain.ResultSet;
import com.lms.mims.domain.life.Economic;
import com.lms.mims.domain.work.Review;
import com.lms.mims.service.life.EconomicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description 经济管理
 * @author&date Created by louiemain on 2018-01-03 10:27
 */
@RestController
@RequestMapping("/eco")
public class EconomicController {

    @Autowired
    private EconomicService economicService;

    /**
     * @description 查询所有
     * @author louiemain
     * @date Created on 2018-01-03 11:19
     * @param
     * @return com.lms.mims.domain.ResultSet<com.lms.mims.domain.life.Economic>
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResultSet<Economic> getAll() {
        return this.economicService.queryAll();
    }

    /**
     * @description 新增
     * @author louiemain
     * @date Created on 2018-01-03 15:48
     * @param economic
     * @return java.lang.String
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(Economic economic) {
        int i = this.economicService.add(economic);
        if (i > 0) {
            return "新增成功。";
        } else {
            return "新增失败。";
        }
    }

    /**
     * @description 更新
     * @author louiemain
     * @date Created on 2018-01-03 16:57
     * @param economic
     * @return java.lang.String
     */
    @RequestMapping(value = "/upd", method = RequestMethod.POST)
    public String upd(Economic economic) {
        int i = this.economicService.upd(economic);
        if (i > 0) {
            return "修改成功。";
        } else {
            return "修改失败。";
        }
    }

    /**
     * @description 删除
     * @author louiemain
     * @date Created on 2018-01-03 16:52
     * @param ecoid
     * @return java.lang.String
     */
    @RequestMapping(value = "/del/{ecoid}", method = RequestMethod.DELETE)
    public String del(@PathVariable("ecoid") int ecoid) {
        int i = this.economicService.del(ecoid);
        if (i > 0) {
            return "删除成功。";
        } else {
            return "删除失败。";
        }
    }
}
